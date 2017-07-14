package com.lzw.exception;

/**
 * 秒杀关闭异常
 * Created by Administrator on 2017/6/30.
 */
public class SeckillCloseException extends RuntimeException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }


}

