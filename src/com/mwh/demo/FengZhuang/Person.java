package com.mwh.demo.FengZhuang;

public class Person {
    private String name;
    private int age;
    void show(){
        System.out.println("姓名"+name+"年龄"+age);
    }

    public void setName(String name){
        if(name.length()>=1&&name.length()<=10){
            this.name=name;
        }else{
            System.out.println("姓名长度不对");
        }
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1&&age<=120) {
            this.age = age;
        }else {
            System.out.println("年龄不合法");
        }
        }





}