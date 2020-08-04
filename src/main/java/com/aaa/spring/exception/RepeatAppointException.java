package com.aaa.spring.exception;

/**
 * @ClassName RepeatAppointException
 * @Author ASUS
 * @Date 2020-07-30 21:18
 * @Version 1.0
 **/

/**
 *
 * 重复预约的异常
 */
public class RepeatAppointException extends RuntimeException{
    public RepeatAppointException(String message){
        super(message);
    }
    public RepeatAppointException(String message,Throwable cause){
        super(message,cause);
    }
}
