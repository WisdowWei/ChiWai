package com.lzw.exception;

/**
 * 秒杀相关业务异常
 * Created by Administrator on 2017/6/30.
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
