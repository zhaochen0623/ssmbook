package com.aaa.spring.dao;

import com.aaa.spring.BaseTest;
import com.aaa.spring.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentDaoTest extends BaseTest {
    @Autowired
    private AppointmentDao appointmentDao;
    @Test
    public void insertAppointment()throws Exception{
        long bookId=1000;
        long studentId=2018012196;
        int len=appointmentDao.insertAppointment(bookId,studentId);
        System.out.println("len:"+len);
    }
    @Test
    public void selectByKeyWithBook()throws Exception{
        long bookId=1000;
        long studentId=2018012196;
        Appointment appointment=appointmentDao.selectByKeyWithBook(bookId,studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }
}
