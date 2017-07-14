package com.lzw.exception;

/**
 * 重复秒杀异常(运行期异常)
 * Created by Administrator on 2017/6/30.
 */
public class RepeatKillException extends RuntimeException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
