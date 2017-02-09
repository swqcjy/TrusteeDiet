package com.armyant.trusteediet.bean.requestbean;

import java.io.Serializable;

/**
 * Created by swq on 2017-02-08.
 */
public class FoodBean implements Serializable {

    private String imgUrl;
    private String name;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
