package com.itlike.demo2;

import org.junit.Test;

/**
 * @ProjectName: SpringProject5
 * @Package: com.itlike.demo2
 * @ClassName: UserDaoTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/18 10:37
 * @Version: 1.0
 */
public class UserDaoTest {
    @Test
    public void test(){
        UserDao userDao = new UserDao();
//        userDao.save();
        UserDao proxy = new UserDaoCglibProxy().createCglibProxy(userDao);
        proxy.save();
//        proxy.update();
    }
}
