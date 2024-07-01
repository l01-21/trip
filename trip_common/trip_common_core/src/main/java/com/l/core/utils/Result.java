package com.l.core.utils;

import com.l.core.constant.ResultConstants;

/**
 * 统一返回结果类
 */
public class Result<T> {
    /**
     * 成功
     * @return 成功
     */
    public static <T> R<T> success() {
        return new R<>(ResultConstants.SUCCESS, ResultConstants.SUCCESS_MSG, null);
    }

    /**
     * 成功
     * @return 成功
     */
    public static <T> R<T> success(T data) {
        return new R<>(ResultConstants.SUCCESS, ResultConstants.SUCCESS_MSG, data);
    }

    /**
     * 失败
     * @return 失败
     */
    public static <T> R<T> fail() {
        return new R<>(ResultConstants.FAIL, ResultConstants.FAIL_MSG, null);
    }

    /**
     * 失败
     * @return 失败
     */
    public static <T> R<T> fail(T data) {
        return new R<>(ResultConstants.FAIL, ResultConstants.FAIL_MSG, data);
    }

    /**
     * 服务器内部错误
     * @return 实例对象
     */
    public static <T> R<T> serverError() {
        return new R<>(ResultConstants.INTERNAL_SERVER_ERROR, ResultConstants.INTERNAL_SERVER_ERROR_MSG, null);
    }

    /**
     * 服务器内部错误
     * @return 实例对象
     */
    public static <T> R<T> serverError(int code, String msg) {
        return new R<>(code, msg, null);
    }


}
