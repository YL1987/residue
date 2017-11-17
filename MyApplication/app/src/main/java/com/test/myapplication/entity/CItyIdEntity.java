package com.test.myapplication.entity;

import com.test.myapplication.engine.BasicResponse;

/**
 * 作者：yangyouqiao on 2017/10/23 11:13
 * 功能：
 */

public class CItyIdEntity extends BasicResponse {

    /**
     * pro_id : 8
     * city_id : 138
     * area_id : 1777
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int pro_id;
        private int city_id;
        private int area_id;

        public int getPro_id() {
            return pro_id;
        }

        public void setPro_id(int pro_id) {
            this.pro_id = pro_id;
        }

        public int getCity_id() {
            return city_id;
        }

        public void setCity_id(int city_id) {
            this.city_id = city_id;
        }

        public int getArea_id() {
            return area_id;
        }

        public void setArea_id(int area_id) {
            this.area_id = area_id;
        }
    }
}
