package com.test.myapplication.home.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.test.myapplication.R
import com.test.myapplication.Utils.LogUtils
import com.test.myapplication.Utils.PreferencesUtils
import com.test.myapplication.Utils.Utils
import com.test.myapplication.engine.AppConstant
import com.test.myapplication.engine.Urls
import com.test.myapplication.entity.HomeLatestEntity
import com.test.myapplication.home.HomeAct
import com.test.myapplication.home.adapter.ListAdapter
import com.test.myapplication.net.DefaultObserver
import com.test.myapplication.net.IdeaApi
import com.test.myapplication.param.HomeLatestParam
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*

/**
 * 作者：yangyouqiao on 2017/10/24 15:23
 * 功能：
 */

class HomePageFrg : Fragment() {

    private var mShowLive: ListView? = null
    private var mlistAdapter: ListAdapter? = null
    private var mliveShow: List<HomeLatestEntity.DataBeanX.DataBean>? = null
    private var homeLatestParam: HomeLatestParam? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.frg_home, container, false)
        mShowLive = view!!.findViewById(R.id.showlivelist) as ListView?
        getData()
        return view
    }

    fun getData() {


        homeLatestParam = HomeLatestParam()
        homeLatestParam?.city_id = PreferencesUtils.getInt(Utils.getContext(), AppConstant.CITYID).toString()
        LogUtils.d("请求参数" + homeLatestParam.toString())
        IdeaApi.getApiService()
                .requestHomeRec(Urls.HOME_REC, homeLatestParam.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DefaultObserver<HomeLatestEntity>(activity as HomeAct, true) {
                    override fun onSuccess(response: HomeLatestEntity) {
//                        mliveShow = ArrayList<HomeLatestEntity.DataBeanX.DataBean>()
                        mliveShow = response.data.data
                        mlistAdapter = ListAdapter(activity, mliveShow)
                        mShowLive?.adapter = mlistAdapter
                    }
                })
    }
}
