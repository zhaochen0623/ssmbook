package com.aaa.spring.service;

import com.aaa.spring.dao.BookDao;
import com.aaa.spring.entity.Book;
import com.aaa.spring.enums.AppointStateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Author ASUS
 * @Date 2020-07-30 20:52
 * @Version 1.0
 **/
@Service
public class BookServiceImpl implements BookService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BookDao bookDao;

    @Override
    public Book selectBookById(long bookId) {
        return bookDao.selectBookById(bookId);
    }

    @Override
    public List<Book> selectAll(int offset, int limit) {
        return bookDao.selectAll(offset,limit);
    }

//    @Override
//    @Transactional
    /**
     * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
     * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
     * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
     */
//    public AppointStateEnum appoint(long bookId, long studentId) {
//        //减库存
//        int updLen=bookDao.reduceNumber(bookId);
//        if (updLen<=0){//库存不足
//            throw new NoNumberException
//        }
//        return null;
//    }


}
