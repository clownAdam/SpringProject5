package com.itlike.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: SpringProject5
 * @Package: com.itlike.demo1
 * @ClassName: GoodsJDKProxy
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/18 3:15
 * @Version: 1.0
 */
public class GoodsJDKProxy {
    public GoodsDao createProxu(GoodsDao goodsDao) {
        //jdk动态代理
        GoodsDao goodsProxy = (GoodsDao) Proxy.newProxyInstance(goodsDao.getClass().getClassLoader(), goodsDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("save".equals(method.getName())) {
                    System.out.println("权限校验-----------");
                    GoodsDao invoke = (GoodsDao) method.invoke(goodsDao, args);
                    return invoke;
                }
                System.out.println("日志保存-----");
                return method.invoke(goodsDao, args);
            }
        });
        return goodsProxy;
    }
}
