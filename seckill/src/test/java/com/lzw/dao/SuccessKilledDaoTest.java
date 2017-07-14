package com.lzw.dao;

import com.lzw.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao sucDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1001L;
        long phone = 123456L;
        int sk = sucDao.insertSuccessKilled(id,phone);
        System.out.println(sk);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1001L;
        long phone = 123456L;
        SuccessKilled successKilled = sucDao.queryByIdWithSeckill(id,phone);
        System.out.println(successKilled);
        System.out.println("------------------");
        System.out.println(successKilled.getSeckill());
    }

}