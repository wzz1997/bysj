package com.wzz.zuolibackend.common.model;

import java.io.Serializable;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.common.model
 * @ClassName: Result
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/11 0011 11:43
 * @Version: 1.0.2
 */
public class Result<T> implements Serializable {

        private static final long serialVersionUID = 1L;
        /**
         * 版本号
         */
        private String version = "1.0";
        /**
         * 结果状态码
         */
        private Integer code;
        /**
         * 返回信息
         */
        private String msg;
        /**
         * 具体数据
         */
        private T data;


        private Result() {
            this.setCode(ErrorConstant.SUCCESS);
            this.setMsg(ErrorConstant.SUCCESS_MSG);
            this.setData(null);
        }

        /**
         * 成功提示
         *
         * @return
         */
        public static Result ok() {
            return new Result();
        }

        /**
         * 成功提示
         *
         * @param msg 提示信息
         * @return
         */
        public static <T> Result<T> ok(String msg) {
            Result<T> r = new Result<>();
            r.setMsg(msg);
            return r;
        }

        /**
         * 成功提示
         *
         * @param obj data
         * @return
         */
        public static <T> Result<T> ok(T obj) {
            Result<T> r = new Result<>();
            r.setData(obj);
            return r;
        }

        /**
         * 成功提示
         *
         * @param msg 提示信息
         * @param obj data
         * @return
         */
        public static <T> Result<T> ok(String msg, T obj) {
            Result<T> r = new Result<>();
            r.setMsg(msg);
            r.setData(obj);
            return r;
        }


        /**
         * 错误提示
         *
         * @return
         */
        public static Result error() {
            return error(ErrorConstant.ERROR_EXCEPTION, ErrorConstant.ERROR_EXCEPTION_MSG);
        }

        /**
         * 错误提示
         *
         * @param msg 提示信息
         * @return
         */
        public static Result error(String msg) {
            return error(ErrorConstant.ERROR_COMMON, msg);
        }

        /**
         * 错误提示
         *
         * @param msg 提示信息
         * @return
         */
        public static <T> Result<T> errorAndReturn(Integer code, String msg, T obj) {
            Result<T> r = new Result<>();
            r.setCode(code);
            r.setMsg(msg);
            r.setData(obj);
            return r;
        }

        public static <T> Result<T> paramLack() {
            return error(ErrorConstant.PARAM_LACK, ErrorConstant.PARAM_LACK_MSG);
        }

        /**
         * 错误提示
         *
         * @param code 返回码
         * @param msg  提示信息
         * @return
         */
        public static <T> Result<T> error(int code, String msg) {
            Result<T> r = new Result<>();
            r.setCode(code);
            r.setMsg(msg);
            r.setData(null);
            return r;
        }

        /**
         * 基本构造方法
         *
         * @param msg 提示信息
         * @param obj data
         * @return
         */
        public static <T> Result<T> instance(Integer code,String msg, T obj) {
            Result<T> r = new Result<>();
            r.setCode(code);
            r.setMsg(msg);
            r.setData(obj);
            return r;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "version='" + version + '\'' +
                    ", code=" + code +
                    ", msg='" + msg + '\'' +
                    ", data=" + data +
                    '}';
        }

    }
