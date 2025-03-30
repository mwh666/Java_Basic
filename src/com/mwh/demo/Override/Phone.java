package com.mwh.demo.Override;
/*
*重写：
* 1.子类定义了一个与其父类中具有相同名称、参数列表和返回类型的方法，
* 当父类方法满足不了子类时，使用super关键字，可以继承父类方法中的结构体，不必重写，但提高了耦合性
 */
public class Phone {

   public void show(){
       System.out.println("打电话");
   }
}