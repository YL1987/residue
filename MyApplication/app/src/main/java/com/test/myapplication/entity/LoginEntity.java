package com.test.myapplication.entity;

import com.test.myapplication.engine.BasicResponse;

/**
 * 作者：yangyouqiao on 2017/9/25 13:26
 * 功能：
 */

public class LoginEntity extends BasicResponse {
    /**
     * id : 189
     * mobile : 13341183737
     * uuid : 0205706
     * nickname : 男的女的那你
     * sex : female
     * avatar : http://oddev.7door.cc/upload/images/2016/07/25//1469418770408402.jpeg
     * level : 0
     * last_login : 2016-07-31 20:46:29
     * activated : true
     * is_broker : true
     * app_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vb2RkZXYuN2Rvb3IuY2MvYXBpL3YxLzEwMDIvYW5kcm9pZCIsImlhdCI6MTQ2OTk2OTE4OSwiZXhwIjoxNDgyMDY1MTg5LCJuYmYiOjE0Njk5NjkxODksImp0aSI6IjZlZDczZDM3OTNhZTY4MDgzYjU3YjIwNWI2ZTQ0NWY1Iiwic3ViIjoxODl9.F3xvQDpGVVnlvVWV4QCMLDhnOJnzntpInG1uEtBGNXI
     * is_fin : true
     * broker_info : {"id":83,"app_uid":189,"realname":"七扇门","contact_phone":"13341183737","company_name":"七扇门","card_img_url":"http://oddev.7door.cc/upload/images/2016/07/25//1469433960545750.jpeg","verify_status":"audited","verify_fail_reason":null}
     */

    private DataBean data;
    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String mobile;
        private String uuid;
        private String nickname;
        private String sex;
        private String avatar;
        private int level;
        private String last_login;
        private boolean activated;
        private boolean is_broker;
        private String app_token;
        private boolean is_fin;
        private boolean is_origin_broker;
        /**
         * id : 83
         * app_uid : 189
         * realname : 七扇门
         * contact_phone : 13341183737
         * company_name : 七扇门
         * card_img_url : http://oddev.7door.cc/upload/images/2016/07/25//1469433960545750.jpeg
         * verify_status : audited
         * verify_fail_reason : null
         */

        private BrokerInfoBean broker_info;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getLast_login() {
            return last_login;
        }

        public void setLast_login(String last_login) {
            this.last_login = last_login;
        }

        public boolean isActivated() {
            return activated;
        }

        public void setActivated(boolean activated) {
            this.activated = activated;
        }

        public boolean isIs_broker() {
            return is_broker;
        }

        public void setIs_broker(boolean is_broker) {
            this.is_broker = is_broker;
        }

        public String getApp_token() {
            return app_token;
        }

        public void setApp_token(String app_token) {
            this.app_token = app_token;
        }

        public boolean isIs_fin() {
            return is_fin;
        }

        public void setIs_fin(boolean is_fin) {
            this.is_fin = is_fin;
        }

        public BrokerInfoBean getBroker_info() {
            return broker_info;
        }
        public boolean isIs_origin_broker() {
            return is_origin_broker;
        }

        public void setIs_origin_broker(boolean is_origin_broker) {
            this.is_origin_broker = is_origin_broker;
        }

        public void setBroker_info(BrokerInfoBean broker_info) {
            this.broker_info = broker_info;
        }

        public static class BrokerInfoBean {
            private int id;
            private int app_uid;
            private String realname;
            private String contact_phone;
            private String company_name;
            private String card_img_url;
            private String verify_status;
            private Object verify_fail_reason;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getApp_uid() {
                return app_uid;
            }

            public void setApp_uid(int app_uid) {
                this.app_uid = app_uid;
            }

            public String getRealname() {
                return realname;
            }

            public void setRealname(String realname) {
                this.realname = realname;
            }

            public String getContact_phone() {
                return contact_phone;
            }

            public void setContact_phone(String contact_phone) {
                this.contact_phone = contact_phone;
            }

            public String getCompany_name() {
                return company_name;
            }

            public void setCompany_name(String company_name) {
                this.company_name = company_name;
            }

            public String getCard_img_url() {
                return card_img_url;
            }

            public void setCard_img_url(String card_img_url) {
                this.card_img_url = card_img_url;
            }

            public String getVerify_status() {
                return verify_status;
            }

            public void setVerify_status(String verify_status) {
                this.verify_status = verify_status;
            }

            public Object getVerify_fail_reason() {
                return verify_fail_reason;
            }

            public void setVerify_fail_reason(Object verify_fail_reason) {
                this.verify_fail_reason = verify_fail_reason;
            }
        }
    }
}
