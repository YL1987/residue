package com.test.jobschedulerdemo;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import static com.test.jobschedulerdemo.MainActivity.MESSENGER_INTENT_KEY;
import static com.test.jobschedulerdemo.MainActivity.MSG_JOB_START;
import static com.test.jobschedulerdemo.MainActivity.MSG_JOB_STOP;
import static com.test.jobschedulerdemo.MainActivity.WORK_DURATION_KEY;

/**
 * 作者：yangyouqiao on 2017/11/17 11:34
 * 功能：
 */

public class MyJobService extends JobService {

    private static final String TAG = MyJobService.class.getSimpleName();

    private Messenger mActivityMessenger;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mActivityMessenger = intent.getParcelableExtra(MESSENGER_INTENT_KEY);
        return START_NOT_STICKY;
    }

    @Override
    public boolean onStartJob(final JobParameters jobParameters) {
        // The work that this service "does" is simply wait for a certain duration and finish
        // the job (on another thread).

        // 该服务做的工作只是等待一定的持续时间并完成作业（在另一个线程上）。
        sendMessage(MSG_JOB_START, jobParameters.getJobId());
        // 当然这里可以处理其他的一些任务
        // TODO something else

        // 获取在activity里边设置的每个任务的周期，其实可以使用setPeriodic()
        long duration = jobParameters.getExtras().getLong(WORK_DURATION_KEY);

        // 使用一个handler处理程序来延迟jobFinished（）的执行。
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sendMessage(MSG_JOB_STOP, jobParameters.getJobId());
                jobFinished(jobParameters, false);
            }
        }, duration);
        Log.i(TAG, "on start job: " + jobParameters.getJobId());

        // 返回true，很多工作都会执行这个地方，我们手动结束这个任务
        return true;

    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        // 停止跟踪这些作业参数，因为我们已经完成工作。
        sendMessage(MSG_JOB_STOP, jobParameters.getJobId());
        Log.i(TAG, "on stop job: " + jobParameters.getJobId());

        // 返回false来销毁这个工作
        return false;
    }

    private void sendMessage(int messageID, @Nullable Object params) {
        // 如果此服务由JobScheduler启动，则没有回调Messenger。
        // 它仅在MainActivity在Intent中使用回调函数调用startService()时存在。
        if (mActivityMessenger == null) {
            Log.d(TAG, "Service is bound, not started. There's no callback to send a message to.");
            return;
        }

        Message m = Message.obtain();
        m.what = messageID;
        m.obj = params;
        try {
            mActivityMessenger.send(m);
        } catch (RemoteException e) {
            Log.e(TAG, "Error passing service object back to activity.");
        }
    }

}
