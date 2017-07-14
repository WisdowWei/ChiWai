package com.lzw.service;

import com.lzw.dto.Exposer;
import com.lzw.dto.SeckillExecution;
import com.lzw.entity.Seckill;
import com.lzw.exception.RepeatKillException;
import com.lzw.exception.SeckillCloseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class SeckillServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("list={}",list);
    }

    @Test
    public void getById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillService.getById(id);
        logger.info("seckill={}",seckill);
    }

    //集成测试代码完整逻辑，注意可重复执行
    @Test
    public void SeckillLogic() throws Exception {
        long id = 1003;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        if (exposer.isExposed()){
            logger.info("exposer={}",exposer);
            long phone = 12345678;
            String md5 = exposer.getMd5();
            try {
                SeckillExecution execution = seckillService.excuteSeckill(id,phone,md5);
                logger.info("result={}",execution);
            } catch (RepeatKillException e){
                logger.error(e.getMessage());
            } catch (SeckillCloseException e){
                logger.error(e.getMessage());
            }
        } else {
            //秒杀未开启
            logger.warn("exposer={}",exposer);
        }

    }

    @Test
    public void excuteSeckill() throws Exception {
        long id = 1002;
        long phone = 12345678;
        String md5 = "256ea1a04c10b4d0698a9b4a323af696";
        try {
            SeckillExecution execution = seckillService.excuteSeckill(id,phone,md5);
            logger.info("result={}",execution);
        } catch (RepeatKillException e){
            logger.error(e.getMessage());
        } catch (SeckillCloseException e){
            logger.error(e.getMessage());
        }

    }

}