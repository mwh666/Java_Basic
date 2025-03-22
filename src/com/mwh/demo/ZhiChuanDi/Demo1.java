package com.mwh.demo.ZhiChuanDi;

public class Demo1 {

    //值传递：
    //   如果参数是基本数据类型 或者字符串 不会改变参数的值
    //   如果参数是引用类型（字符串除外），会改变参数的值，因为传递的是地址值
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.show(demo.name);
        System.out.println(demo.name);
    }
}