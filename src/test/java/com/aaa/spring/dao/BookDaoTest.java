package com.aaa.spring.dao;

import com.aaa.spring.BaseTest;
import com.aaa.spring.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void selectBookById() throws Exception{
        long bookId=1000;
        Book book=bookDao.selectBookById(bookId);
        System.out.println(book);
    }
    @Test
    public void selectAll() throws Exception{
        List<Book> bookList=bookDao.selectAll(0,4);
        for (Book book:bookList){
            System.out.println(book);
        }
    }

    @Test
    public void reduceNumber() throws Exception{
        long bookId=1000;
        int len =bookDao.reduceNumber(bookId);
        System.out.println(len);
    }
}
