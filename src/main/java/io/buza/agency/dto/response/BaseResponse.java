package io.buza.agency.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.PageInfo;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


    @Getter private int status;
    @Getter private int code;
    @Getter private List<T> list;
    @Getter private T data;
    @Getter private String msg;
    @Getter private PageInfo<T> pageInfo;

    private BaseResponse(String msg) {
        this.msg = msg;
    }

    private BaseResponse(int status, int code, String msg, PageInfo<T> pageInfo) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.pageInfo = pageInfo;
    }

    private BaseResponse(int status, int code, String msg, List<T> list) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = (T) list;
    }

    private BaseResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private BaseResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private BaseResponse(int status, int code, String msg) {
        this.status = status;
        this.code = code;
        this.msg = msg;
    }

    public static <T> BaseResponse<T> valueOfSuccess() {
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc());
    }

    public static <T> BaseResponse<T> valueOfSuccessCodeMessage(int code, String msg) {
        return new BaseResponse<>(code, msg);
    }

    public static <T> BaseResponse<T> valueOfSuccess(T data) {
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc(), data);
    }

    public static <T> BaseResponse<T> valueOfSuccessMessage(String msg) {
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.CODE.getCode(), msg);
    }

    public static <T> BaseResponse<T> valueOfSuccessListWithPagination(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        pageInfo.setList(list);
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.CODE.getCode(), ResponseCode.SUCCESS.getDesc(), pageInfo);
    }

    public static <T> BaseResponse<T> valueOfSuccessList(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        pageInfo.setList(list);
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.CODE.getCode(), ResponseCode.SUCCESS.getDesc(), pageInfo.getList());
    }

    public static <T> BaseResponse<T> valueOfSuccessListMessage(String msg, List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        pageInfo.setList(list);
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.CODE.getCode(), msg, pageInfo.getList());
    }

    public static <T> BaseResponse<T> valueOfFailure() {
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.ERROR.getDesc());
    }

    public static <T> BaseResponse<T> valueOfFailure(T data) {
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.ERROR.getDesc(), data);
    }

    public static <T> BaseResponse<T> valueOfFailureMessage(String msg) {
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.ERROR.getCode(), msg);
    }

    public static <T> BaseResponse<T> valueOfFailureCodeMessage(int code, String msg) {
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), code, msg);
    }

    public static <T> BaseResponse<T> valueOfFailureList(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        pageInfo.setList(list);
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.CODE_ERROR.getCode(), ResponseCode.ERROR.getDesc(), list);
    }

    public static <T> BaseResponse<T> valueOfFailureListMessage(String msg, List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        pageInfo.setList(list);
        return new BaseResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.CODE_ERROR.getCode(), msg, pageInfo.getList());
    }

}
