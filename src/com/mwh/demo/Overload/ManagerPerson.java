package com.mwh.demo.Overload;

public class ManagerPerson extends Person{


    public void Show(){
        System.out.println("名字是"+getName()+"性别是"+ getSex());
    }
    public void Like(){
        System.out.println("喜欢玩电脑");
    }
}