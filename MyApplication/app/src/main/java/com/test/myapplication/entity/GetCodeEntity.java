package com.test.myapplication.entity;

import com.test.myapplication.engine.BasicResponse;

/**
 * 作者：yangyouqiao on 2017/10/12 14:32
 * 功能：
 */

public class GetCodeEntity  extends BasicResponse {

    /**
     * verify_code : 666666
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String verify_code;

        public String getVerify_code() {
            return verify_code;
        }

        public void setVerify_code(String verify_code) {
            this.verify_code = verify_code;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "verify_code='" + verify_code + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetCodeEntity{" +
                "data=" + data +
                '}';
    }
}
