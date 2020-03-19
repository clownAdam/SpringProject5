package com.itlike.demo1;

/**
 * @ProjectName: SpringProject5
 * @Package: com.itlike.demo1
 * @ClassName: GoodsDaoImpl
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/18 2:55
 * @Version: 1.0
 */
public class GoodsDaoImpl implements GoodsDao {
    @Override
    public void save() {
//        check();
        System.out.println("保存操作");
    }

    @Override
    public String update() {
        System.out.println("更新操作");
        return "update-------------";
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void find() {
        System.out.println("find");
//        int i = 1 / 0;
//        System.out.println(i);
    }
    /*public void check(){
        System.out.println("权限校验");
    }*/
}
