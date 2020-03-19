package com.itlike.demo1;

import org.junit.Test;

/**
 * @ProjectName: SpringProject5
 * @Package: com.itlike.demo1
 * @ClassName: GoodsDaoTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/18 2:56
 * @Version: 1.0
 */
public class GoodsDaoTest {
    @Test
    public void test() {
//        GoodsDaoImpl goodsDao = new GoodsDaoImpl();
        GoodsDao goodsDao = (GoodsDao) new GoodsDaoImpl();
//        goodsDao.save();
        GoodsJDKProxy goodsJDKProxy = new GoodsJDKProxy();
        GoodsDao proxy = goodsJDKProxy.createProxu(goodsDao);
        proxy.save();
        proxy.update();
    }
}
