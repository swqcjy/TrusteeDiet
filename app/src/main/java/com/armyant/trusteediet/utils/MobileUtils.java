package com.armyant.trusteediet.utils;

import android.text.TextUtils;
import android.widget.EditText;

import com.armyant.trusteediet.TrusteeDietApplication;

/**
 * Created by swq on 2016/12/8.
 */
public class MobileUtils {

    /**
     *     检查手机号和验证码
     *
     */
    public static boolean checkUpPhone(EditText etPhone) {

        if (TextUtils.isEmpty(etPhone.getText().toString())) {
            ToastUtils.showToast(TrusteeDietApplication.getContext(), "手机号不能为空");
            return false;
        }


        String telRegex = "[1][34578]\\d{9}";//"[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (!etPhone.getText().toString().matches(telRegex)) {
            ToastUtils.showToast(TrusteeDietApplication.getContext(), "手机号格式不正确");
            return false;
        }
        return true;
    }

    public static boolean checkUpCode(EditText etPhone) {


        if (TextUtils.isEmpty(etPhone.getText().toString())) {
            ToastUtils.showToast(TrusteeDietApplication.getContext(), "验证码不能为空");
            return false;
        }

        return true;
    }

    public static boolean checkUpPwd(EditText etPwd) {


        if (TextUtils.isEmpty(etPwd.getText().toString())) {
            ToastUtils.showToast(TrusteeDietApplication.getContext(), "密码不能为空");
            return false;
        }

        if (etPwd.getText().toString().length() < 6) {
            ToastUtils.showToast(TrusteeDietApplication.getContext(), "请输入6-16位密码");
            return false;
        }

        return true;
    }
}
