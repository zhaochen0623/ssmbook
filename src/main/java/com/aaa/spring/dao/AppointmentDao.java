package com.aaa.spring.dao;

import com.aaa.spring.entity.Appointment;
import org.apache.ibatis.annotations.Param;

public interface AppointmentDao {
    /**
     * 插入预约图书记录
     *
     * @param bookId
     * @param studentId
     * @return 插入的行数
     */
    int insertAppointment(@Param("bookId") long bookId,@Param("studentId") long studentId);

    /**
     *
     * 通过主键查询预约图书记录 ,并携带图书实体
     * @param bookId
     * @param studentId
     * @return
     */
    Appointment selectByKeyWithBook(@Param("bookId") long bookId,@Param("studentId") long studentId);
}
