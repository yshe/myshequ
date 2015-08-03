package com.community.common;

/**
 * Created by junji on 2015/2/9.
 */
public class RestRspVO<T> extends BaseRespVO {

    public T result;
    public RestRspVO(){
        super();
    }
    public RestRspVO(Integer code, String message){
        super(code,message);
    }
    public RestRspVO(Integer code, String message, T result) {
        super(code, message);
        this.result = result;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
