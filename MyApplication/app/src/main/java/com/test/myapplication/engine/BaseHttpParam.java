package com.test.myapplication.engine;

import com.google.gson.Gson;
import com.test.myapplication.Utils.AppUtils;
import com.test.myapplication.Utils.Utils;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/2/15.
 */
public abstract class BaseHttpParam implements Serializable {
    private String app_version=String.valueOf(AppUtils.getVersionCode(Utils.getContext()));

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return new Gson().toJson(this);
    }

}
