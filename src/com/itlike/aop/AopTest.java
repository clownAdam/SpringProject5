package com.itlike.aop;

import com.itlike.demo1.GoodsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ProjectName: SpringProject5
 * @Package: com.itlike.aop
 * @ClassName: AopTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/19 4:14
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
//    @Autowired
//    @Qualifier
    @Resource(name = "goodsDao")
    private GoodsDao goodsDao;
    @Test
    public void test(){
//        this.goodsDao.save();
//        this.goodsDao.update();
        this.goodsDao.delete();
        goodsDao.find();
    }
}
