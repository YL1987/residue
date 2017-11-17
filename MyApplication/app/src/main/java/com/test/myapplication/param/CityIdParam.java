package com.test.myapplication.param;

import com.test.myapplication.engine.BaseHttpParam;

/**
 * 作者：yangyouqiao on 2017/10/23 11:15
 * 功能：
 */

public class CityIdParam extends BaseHttpParam{
    private String pro_name;
    private String city_name;
    private String area_name;

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }
}
