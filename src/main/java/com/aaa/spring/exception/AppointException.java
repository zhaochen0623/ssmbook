package com.aaa.spring.exception;

/**
 * @ClassName AppointException
 * @Author ASUS
 * @Date 2020-07-30 21:21
 * @Version 1.0
 **/

/**
 * 预约业务异常
 */
public class AppointException extends RuntimeException{
    public AppointException(String message){
        super(message);
    }
    public AppointException(String message,Throwable cause){
        super(message,cause);
    }
}
