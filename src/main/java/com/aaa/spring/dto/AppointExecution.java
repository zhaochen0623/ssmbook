package com.aaa.spring.dto;

/**
 * @ClassName AppointExecution
 * @Author ASUS
 * @Date 2020-07-30 21:09
 * @Version 1.0
 **/

import com.aaa.spring.entity.Appointment;

/**
 * 封装预约执行后结果
 *
 */
public class AppointExecution {
    //图书ID
    private long bookId;
    //秒杀预约结果状态
    private int state;
    //状态标识
    private String stateInfo;
    //预约成功对象
    private Appointment appointment;

    public AppointExecution() {
    }
    //预约成功的构造器
    public AppointExecution(long bookId, int state, String stateInfo) {
        this.bookId = bookId;
        this.state = state;
        this.stateInfo = stateInfo;
    }
    //预约失败的构造器
    public AppointExecution(long bookId, int state, String stateInfo, Appointment appointment) {
        this.bookId = bookId;
        this.state = state;
        this.stateInfo = stateInfo;
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
