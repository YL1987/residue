package com.test.myapplication.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.test.myapplication.R;
import com.test.myapplication.Utils.LogUtils;
import com.test.myapplication.Utils.PreferencesUtils;
import com.test.myapplication.Utils.Utils;
import com.test.myapplication.engine.AppConstant;
import com.test.myapplication.engine.BaseAct;
import com.test.myapplication.engine.Urls;
import com.test.myapplication.entity.HomeLatestEntity;
import com.test.myapplication.home.fragment.AttentionPageFrg;
import com.test.myapplication.home.fragment.HomePageFrg;
import com.test.myapplication.home.fragment.MessagePageFrg;
import com.test.myapplication.home.fragment.MySelfPageFrg;
import com.test.myapplication.net.DefaultObserver;
import com.test.myapplication.net.IdeaApi;
import com.test.myapplication.param.HomeLatestParam;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


@Route(path = "/onedoor/main/home")
public class HomeAct extends BaseAct {

    @BindView(R.id.realtabcontent)
    FrameLayout mRealtabcontent;
    @BindView(android.R.id.tabcontent)
    FrameLayout mTabcontent;
    @BindView(android.R.id.tabhost)
    FragmentTabHost mTabhost;
    @BindView(R.id.bottom)
    RelativeLayout mBottom;
    @BindView(R.id.activity_main)
    AutoRelativeLayout mActivityMain;
    @BindView(R.id.dl_drawer)
    DrawerLayout mDlDrawer;

    private HomeLatestParam homeLatestParam;
    private Class fragmentArray[] = {HomePageFrg.class, AttentionPageFrg.class, MessagePageFrg.class, MySelfPageFrg.class};

    //tab显示图标
    private int mImageViewArray[] = {R.drawable.tab_video_btn, R.drawable.tab_map_btn, R.drawable.tab_message_btn, R.drawable.tab_selfinfo_btn};

    //Tab显示文字
    private String mTextviewArray[] = {"首页", "关注", "消息", "我的"};
    private FragmentTabHost mTabHost;
    private List<Fragment> fragmentList = new ArrayList<>();
    private LayoutInflater layoutInflater;
    private TextView red_point;
    private View view;

    @Override
    public void widgetClick(View v) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_home;
    }

    @Override
    public void initView() {
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        layoutInflater = LayoutInflater.from(this);
        getFrag();
        int count = fragmentList.size();
        for (int i = 0; i < count; i++) {
            if (mTabhost != null) {
                TabHost.TabSpec tabSpec = mTabhost.newTabSpec(mTextviewArray[i]).setIndicator(getTabItemView(i));
                mTabhost.addTab(tabSpec, fragmentList.get(i).getClass(), null);
            }

        }
    }

    @Override
    public void setListener() {
    }

    @Override
    public void doBusiness() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    void getFrag() {
        HomePageFrg f1 = new HomePageFrg();
        AttentionPageFrg f2 = new AttentionPageFrg();
        MessagePageFrg f3 = new MessagePageFrg();
        MySelfPageFrg f4 = new MySelfPageFrg();
        fragmentList.add(f1);
        fragmentList.add(f2);
        fragmentList.add(f3);
        fragmentList.add(f4);
    }

    private View getTabItemView(int index) {
        if (index == 3) {
            view = layoutInflater.inflate(R.layout.red_point_tab_item_view, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
            red_point = (TextView) view.findViewById(R.id.red_point);
            imageView.setImageResource(mImageViewArray[index]);
            TextView textView = (TextView) view.findViewById(R.id.text);
            textView.setText(mTextviewArray[index]);

            red_point.setVisibility(View.GONE);


        } else {
            view = layoutInflater.inflate(R.layout.tab_item_view, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
            imageView.setImageResource(mImageViewArray[index]);
            TextView textView = (TextView) view.findViewById(R.id.text);
            textView.setText(mTextviewArray[index]);
        }


        return view;
    }
}
