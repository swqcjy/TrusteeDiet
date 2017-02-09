/**
 *
 */
package com.armyant.trusteediet.bean.okhttpbean;


import com.armyant.trusteediet.utils.Constants;

import java.io.Serializable;

/**
 * @author longya
 * @version 创建时间：2015-6-24 下午8:43:41
 *          类说明 :
 * @E-mail: xueyelongya@126.com
 */
public class ResultBean<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private T data;

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }


    public boolean isSuccess() {
        if (code == Constants.RESULT_CODE_SUCCESS)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

}
