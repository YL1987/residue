package com.test.myapplication.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.test.myapplication.R;
import com.test.myapplication.entity.HomeLatestEntity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：yangyouqiao on 2017/10/24 16:52
 * 功能：
 */

public class ListAdapter extends BaseAdapter {
    private Context mContext;
    private List<HomeLatestEntity.DataBeanX.DataBean> mDataBeen;
    public LayoutInflater inflater;

    public ListAdapter(Context context, List<HomeLatestEntity.DataBeanX.DataBean> dataBeen) {
        mContext = context;
        mDataBeen = dataBeen;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mDataBeen.size();
    }

    @Override
    public Object getItem(int i) {
        return mDataBeen.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder VH;
        if (view == null) {
            view = inflater.inflate(R.layout.item_listshow, null);
            VH = new ViewHolder(view);
            view.setTag(VH);
        } else {
            VH = (ViewHolder) view.getTag();
        }

        HomeLatestEntity.DataBeanX.DataBean listData = mDataBeen.get(i);
        VH.mName.setText(listData.property);
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.name)
        TextView mName;
        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
