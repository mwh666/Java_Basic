package com.mwh.demo.Overload;
/*
重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
重载规则:

被重载的方法必须改变参数列表(参数个数或类型不一样)；
被重载的方法可以改变返回类型；
被重载的方法可以改变访问修饰符；
被重载的方法可以声明新的或更广的检查异常；
方法能够在同一个类中或者在一个子类中被重载。
无法以返回值类型作为重载函数的区分标准。
 */
public class Person {
    public String name;
    public String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Person(){

    }
    public Person(String name,String sex){
        this.name=name;
        this.sex=sex;
    }
    public void Show(){
        System.out.println("名字是"+name+"性别是"+sex);
    }
    public void Like(){
        System.out.println("喜欢玩电脑");
    }

}