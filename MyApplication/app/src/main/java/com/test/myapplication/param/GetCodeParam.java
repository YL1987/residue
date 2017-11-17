package com.test.myapplication.param;

import com.test.myapplication.engine.BaseHttpParam;

/**
 * 作者：yangyouqiao on 2017/10/12 14:38
 * 功能：
 */

public class GetCodeParam extends BaseHttpParam {
    private String mobile;
    private String type;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
