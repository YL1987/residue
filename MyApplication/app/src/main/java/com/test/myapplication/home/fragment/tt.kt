package com.test.myapplication.home.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

import com.test.myapplication.R
import com.test.myapplication.entity.HomeLatestEntity
import com.test.myapplication.home.adapter.ListAdapter

/**
 * 作者：yangyouqiao on 2017/10/24 16:58
 * 功能：
 */

class tt : Fragment() {
    private var mListView: ListView? = null

    private val mHomeLatestEntity: HomeLatestEntity? = null
    private val mDataBeen: List<HomeLatestEntity.DataBeanX.DataBean>? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.frg_home, container, false)
        mListView = view.findViewById(R.id.showlivelist) as ListView
        mListView!!.adapter = ListAdapter(activity, mHomeLatestEntity!!.data.data)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
