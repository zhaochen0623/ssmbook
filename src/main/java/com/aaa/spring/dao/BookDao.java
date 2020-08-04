package com.aaa.spring.dao;

import com.aaa.spring.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {
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
    List<Book> selectAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数>1,表示更新的记录行数
     */
    int reduceNumber(long bookId);
}
