package com.test.myapplication.param;

import com.test.myapplication.engine.BaseHttpParam;

/**
 * Created by wangyangyang on 16/7/17.
 */
public class LoginParam extends BaseHttpParam {

    private String method;
    private String type;
    private String ident;

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    private String mobile;
    private String verify_code;
    private String openid;
    private String nickname;
    private String avatar;
    private String sex;
    private String wx_union_id;

    public String getWx_union_id() {
        return wx_union_id;
    }

    public void setWx_union_id(String wx_union_id) {
        this.wx_union_id = wx_union_id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVerify_code() {
        return verify_code;
    }

    public void setVerify_code(String verify_code) {
        this.verify_code = verify_code;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
