package com.test.myapplication.engine;

/**
 *
 */
public class BasicResponse<T> {


//    private T data;
    private boolean error;
    private String status;
    private String msg;
    private Object extra;
    private String code;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
