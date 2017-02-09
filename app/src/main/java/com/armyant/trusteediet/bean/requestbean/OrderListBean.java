package com.armyant.trusteediet.bean.requestbean;

import java.io.Serializable;

/**
 * Created by swq on 2017-01-19.
 */
public class OrderListBean implements Serializable {


    /**
     * waybillNo : string
     * userId : 0
     * courierId : 0
     * senderName : string
     * senderPhone : string
     * senderAddress : string
     * senderLongitude : 0
     * senderLatitude : 0
     * receiverName : string
     * receiverPhone : string
     * receiverAddress : string
     * receiverLongitude : 0
     * receiverLatitude : 0
     * pickupTime : 2017-01-19T00:14:56.140Z
     * goodsTypeId : 0
     * goodsType : string
     * isInsure : 0
     * insurePrice : 0
     * remark : string
     * payTypeId : 0
     * payType : string
     * senderDistance : 0
     * receiverDistance : 0
     * createTime : 2017-01-19T00:14:56.140Z
     * status : 0
     * statusDesc : string
     * price : 0
     * type : 0
     */

    private String waybillNo;
    private int userId;
    private int courierId;
    private String senderName;
    private String senderPhone;
    private String senderAddress;
    private int senderLongitude;
    private int senderLatitude;
    private String receiverName;
    private String receiverPhone;
    private String receiverAddress;
    private int receiverLongitude;
    private int receiverLatitude;
    private String pickupTime;
    private int goodsTypeId;
    private String goodsType;
    private int isInsure;
    private double insurePrice;
    private String remark;
    private int payTypeId;
    private String payType;
    private double senderDistance;
    private double receiverDistance;
    private String createTime;
    private int status;
    private String statusDesc;
    private double price;
    private int type;

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourierId() {
        return courierId;
    }

    public void setCourierId(int courierId) {
        this.courierId = courierId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public int getSenderLongitude() {
        return senderLongitude;
    }

    public void setSenderLongitude(int senderLongitude) {
        this.senderLongitude = senderLongitude;
    }

    public int getSenderLatitude() {
        return senderLatitude;
    }

    public void setSenderLatitude(int senderLatitude) {
        this.senderLatitude = senderLatitude;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public int getReceiverLongitude() {
        return receiverLongitude;
    }

    public void setReceiverLongitude(int receiverLongitude) {
        this.receiverLongitude = receiverLongitude;
    }

    public int getReceiverLatitude() {
        return receiverLatitude;
    }

    public void setReceiverLatitude(int receiverLatitude) {
        this.receiverLatitude = receiverLatitude;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public int getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(int goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public int getIsInsure() {
        return isInsure;
    }

    public void setIsInsure(int isInsure) {
        this.isInsure = isInsure;
    }

    public double getInsurePrice() {
        return insurePrice;
    }

    public void setInsurePrice(double insurePrice) {
        this.insurePrice = insurePrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(int payTypeId) {
        this.payTypeId = payTypeId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public double getSenderDistance() {
        return senderDistance;
    }

    public void setSenderDistance(double senderDistance) {
        this.senderDistance = senderDistance;
    }

    public double getReceiverDistance() {
        return receiverDistance;
    }

    public void setReceiverDistance(double receiverDistance) {
        this.receiverDistance = receiverDistance;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
