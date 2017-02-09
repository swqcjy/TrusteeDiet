package com.armyant.trusteediet.net;


import com.armyant.trusteediet.bean.okhttpbean.ResultBean;
import com.armyant.trusteediet.bean.requestbean.LoginBean;
import com.armyant.trusteediet.bean.requestbean.OrderListBean;
import com.armyant.trusteediet.bean.requestbean.VehicleBean;

import java.util.List;
import java.util.Map;

import retrofit.Call;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by swq on 2016/11/3.
 */
public interface RestService {


    //获取验证码
    @FormUrlEncoded
    @POST(WuExpressUris.CAPTCHA_CREATE)
    Call<ResultBean<String>> captchaCreate(@FieldMap Map<String, Object> params);


    //验证验证码
    @FormUrlEncoded
    @POST(WuExpressUris.CAPTCHA_VERIFY)
    Call<ResultBean<String>> captchaVerify(@FieldMap Map<String, Object> params);


    //重置密码
    @FormUrlEncoded
    @POST(WuExpressUris.RESET_PWD)
    Call<ResultBean<String>> resetPwd(@FieldMap Map<String, Object> params);

    //登录
    @FormUrlEncoded
    @POST(WuExpressUris.LOGIN)
    Call<ResultBean<LoginBean>> login(@FieldMap Map<String, Object> params);

    //注册
    @FormUrlEncoded
    @POST(WuExpressUris.REGISTER)
    Call<ResultBean<String>> register(@FieldMap Map<String, Object> params);

    //交通工具列表
    @FormUrlEncoded
    @POST(WuExpressUris.VEHICLE_LIST)
    Call<ResultBean<List<VehicleBean>>> vehicleList(@FieldMap Map<String, Object> params);

    //配送池列表
    @FormUrlEncoded
    @POST(WuExpressUris.ORDER_LIST)
    Call<ResultBean<List<OrderListBean>>> orderList(@FieldMap Map<String, Object> params);

    //抢单
    @FormUrlEncoded
    @POST(WuExpressUris.ORDER_GRAP)
    Call<ResultBean<List<OrderListBean>>> orderGrap(@FieldMap Map<String, Object> params);
}
