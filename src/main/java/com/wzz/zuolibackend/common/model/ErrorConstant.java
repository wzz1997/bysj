package com.wzz.zuolibackend.common.model;

/**
 * @program: zuoli
 * @description: 错误返回常量类
 * @author: wzz
 * @create: 2018/11/2010:24
 **/
public class ErrorConstant {

    /**
     * 通用返回
     */
    public static final Integer SUCCESS = 200;
    public static final String SUCCESS_MSG = "请求成功";
    public static final Integer PARAM_LACK = 201;
    public static final String PARAM_LACK_MSG = "参数不足";
    public static final Integer ERROR_VALIDATE_FAILURE = 202;
    public static final String ERROR_VALIDATE_FAILURE_MSG = "token校验失败";
    public static final Integer ERROR_WRONG_ACCOUNT = 203;
    public static final String ERROR_WRONG_ACCOUNT_MSG= "用户不存在";
    public static final Integer ERROR_WRONG_PASSWORD = 204;
    public static final String ERROR_WRONG_PASSWORD_MSG = "密码不正确";
    public static final Integer ERROR_COMMON = 205;
    public static final String ERROR_COMMON_MSG = "错误";
    public static final Integer ERROR_FILE_UPLOAD_ERROR = 206;
    public static final String ERROR_FILE_UPLOAD_ERROR_MSG = "文件上传失败";
    public static final Integer ERROR_EXPORT_EXCEL_ERROR = 207;
    public static final String ERROR_EXPORT_EXCEL_ERROR_MSG = "文件导出失败";
    public static final Integer ERROR_PHONE_CODE_GET = 208;
    public static final String ERROR_PHONE_CODE_GET_MSG = "验证码获取错误";
    public static final Integer ERROR_PHONE_CODE_ERROR = 209;
    public static final String ERROR_PHONE_CODE_ERROR_MSG = "验证码不正确或者失效";
    public static final Integer ERROR_SYSUSER_DISABLED = 210;
    public static final String ERROR_SYSUSER_DISABLED_MSG = "用户名未启用，请联系管理员";
    public static final Integer FORBIDDEN = 401;
    public static final String FORBIDDEN_MSG = "权限不足，请联系管理员!";
    public static final Integer ERROR_PAGE_NOT_FOUND = 404;
    public static final String ERROR_PAGE_NOT_FOUND_MSG = "接口不存在";
    public static final Integer ERROR_EXCEPTION = 500;
    public static final String ERROR_EXCEPTION_MSG = "未知异常，请联系管理员";

}