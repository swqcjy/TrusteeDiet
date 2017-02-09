package com.armyant.trusteediet.bean.requestbean;

import java.io.Serializable;

/**
 * Created by swq on 2017-01-18.
 */
public class UserBean implements Serializable {

    private static UserBean instance = null;

    private UserBean() {

    }

    public static UserBean getInstance() {

        if (instance == null) {

            synchronized (UserBean.class) {

                if (instance == null)
                    instance = new UserBean();
            }
        }

        return instance;
    }




    /**
     * createTime : 1484709686000
     * updateTime : 1484709686000
     * courierId : 4
     * password : null
     * phone : 15695497897
     * ticket : 644b7007-2d3e-4ba4-9e58-0b512973dbc1
     * profileImageUrl : null
     * status : 0
     * name : null
     * idCard :
     * idCardA : null
     * idCardB : null
     * areaId : null
     * area : null
     * vehicleId : null
     * vehicle : null
     */

    private long createTime;
    private long updateTime;
    private int courierId;
    private Object password;
    private String phone;
    private String ticket;
    private Object profileImageUrl;
    private int status;
    private Object name;
    private String idCard;
    private Object idCardA;
    private Object idCardB;
    private Object areaId;
    private Object area;
    private Object vehicleId;
    private Object vehicle;

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public int getCourierId() {
        return courierId;
    }

    public void setCourierId(int courierId) {
        this.courierId = courierId;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Object getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(Object profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Object getIdCardA() {
        return idCardA;
    }

    public void setIdCardA(Object idCardA) {
        this.idCardA = idCardA;
    }

    public Object getIdCardB() {
        return idCardB;
    }

    public void setIdCardB(Object idCardB) {
        this.idCardB = idCardB;
    }

    public Object getAreaId() {
        return areaId;
    }

    public void setAreaId(Object areaId) {
        this.areaId = areaId;
    }

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public Object getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Object vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Object getVehicle() {
        return vehicle;
    }

    public void setVehicle(Object vehicle) {
        this.vehicle = vehicle;
    }

}
