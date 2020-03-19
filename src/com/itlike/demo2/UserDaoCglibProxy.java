package com.itlike.demo2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: SpringProject5
 * @Package: com.itlike.demo2
 * @ClassName: UserDaoCglibProxy
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/18 10:38
 * @Version: 1.0
 */
public class UserDaoCglibProxy implements MethodInterceptor {
    public UserDao createCglibProxy(UserDao userDao){
        //创建核心类
        Enhancer enhancer = new Enhancer();
        //设置父类 继承方式 创建子类，自动继承UserDao类
        enhancer.setSuperclass(userDao.getClass());
        //设置回调
        enhancer.setCallback(this);
        //创建代理对象
        UserDao obj = (UserDao) enhancer.create();
        return obj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        if("save".equals(method.getName())){
            System.out.println("权限");
            return  methodProxy.invokeSuper(o, objects);
        }
        return methodProxy.invokeSuper(o, objects);
    }
}
