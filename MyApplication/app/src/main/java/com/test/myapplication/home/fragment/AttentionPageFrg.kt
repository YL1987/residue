package com.test.myapplication.home.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.test.myapplication.R

/**
 * 作者：yangyouqiao on 2017/10/24 15:23
 * 功能：
 */

class AttentionPageFrg : Fragment() {

    private var mTitle: TextView? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.frg_attention, container, false)
        mTitle=view!!.findViewById(R.id.attenion_title) as TextView
        getData()
        return view

    }

    fun getData() {
        mTitle!!.text="暂无数据"
    }
}
