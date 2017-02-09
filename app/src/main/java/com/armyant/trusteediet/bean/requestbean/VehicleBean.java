package com.armyant.trusteediet.bean.requestbean;

import java.io.Serializable;

/**
 * Created by swq on 2017-01-18.
 */
public class VehicleBean implements Serializable {


    /**
     * id : 0
     * name : string
     */

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
