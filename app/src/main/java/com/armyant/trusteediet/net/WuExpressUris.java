package com.armyant.trusteediet.net;

/**
 * Created by swq on 2016/11/3.
 */
public class WuExpressUris {

    public static String BASE_HOST = "http://api.oglvip.com";

    public static final String CAPTCHA_CREATE = "/wuliu/api/courier/captcha/create"; //获取验证码
    public static final String CAPTCHA_VERIFY = "/wuliu/api/courier/captcha/verify"; //验证验证码
    public static final String RESET_PWD = "/wuliu/api/courier/password/forget"; //忘记密码。重置密码
    public static final String LOGIN = "/wuliu/api/courier/login"; //登录
    public static final String REGISTER = "/wuliu/api/courier/register"; //注册
    public static final String VEHICLE_LIST = "/wuliu/api/courier/vehicle/list"; //交通工具列表
    public static final String ORDER_LIST = "/wuliu/api/courier/order/list"; //配送池列表
    public static final String ORDER_GRAP = "/wuliu/api/courier/order/grap"; //抢单

}
