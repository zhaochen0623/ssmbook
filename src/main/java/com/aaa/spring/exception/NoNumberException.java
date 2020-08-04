package com.aaa.spring.exception;

/**
 * @ClassName NoNumberException
 * @Author ASUS
 * @Date 2020-07-30 21:18
 * @Version 1.0
 **/

/**
 *
 * 库存不足异常
 */
public class NoNumberException extends RuntimeException{
    public NoNumberException(String message){
        super(message);
    }
    public NoNumberException(String message,Throwable cause){
        super(message,cause);
    }
}
