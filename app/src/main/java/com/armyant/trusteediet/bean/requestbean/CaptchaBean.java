package com.armyant.trusteediet.bean.requestbean;

import java.io.Serializable;

/**
 * Created by swq on 2016/12/13.
 */
public class CaptchaBean implements Serializable {

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;

}
