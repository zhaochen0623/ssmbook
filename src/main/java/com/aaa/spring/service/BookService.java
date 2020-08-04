package com.aaa.spring.service;

import com.aaa.spring.entity.Book;
import com.aaa.spring.enums.AppointStateEnum;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName BookService
 * @Author ASUS
 * @Date 2020-07-30 20:51
 * @Version 1.0
 **/
public interface BookService {

    /**
     *
     * 根据id查询图书
     * @param bookId
     * @return
     */
    Book selectBookById(long bookId);
    /**
     * 查询所有书籍
     * 分页
     * @param offset
     * @param limit
     * @return
     */
    List<Book> selectAll(@Param("offset") int offset, @Param("limit") int limit);
//    /**
//     * 减少馆藏数量
//     *
//     * @param bookId
//     * @return 如果影响行数>1,表示更新的记录行数
//     */
//    int reduceNumber(long bookId);
//    /**
//     * 预约图书
//     *
//     * @param bookId
//     * @param studentId
//     * @return
//     */
//    AppointStateEnum appoint(long bookId, long studentId);

}
