package com.benym.concurrentregister.response;

import lombok.Data;

/**
 * @Time : 2022/4/23 19:46
 */
@Data
public class RestResponse {

    private int code;

    private String message;

    private Object data;

    public RestResponse(){

    }

    public static RestResponse succuess(){
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(ResultCode.SUCCESS);
        return restResponse;
    }

    public static RestResponse succuess(Object data,String message){
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(ResultCode.SUCCESS);
        restResponse.setData(data);
        restResponse.setMessage(message);
        return restResponse;
    }

    public static RestResponse fail() {
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(ResultCode.FAIL);

        return restResponse;
    }


    public static RestResponse fail(ResultCode resultCode) {
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(resultCode);

        return restResponse;
    }

    public static RestResponse fail(String message) {
        RestResponse restResponse = new RestResponse();
        restResponse.setCode(ResultCode.FAIL.code());
        restResponse.setMessage(message);

        return restResponse;
    }

    public static RestResponse fail(Integer code, String message) {
        RestResponse restResponse = new RestResponse();
        restResponse.setCode(code);
        restResponse.setMessage(message);

        return restResponse;
    }

    public static RestResponse fail(ResultCode resultCode, Object data) {
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(resultCode);
        restResponse.setData(data);

        return restResponse;
    }

    private void setResultCode(ResultCode resultCode){
        this.code = resultCode.code();
        this.message = resultCode.message();
    }
}
