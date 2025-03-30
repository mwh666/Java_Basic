package com.mwh.demo.Override;

public class NewNewPhone extends NewPhone{

    public void show(){
        super.show();
        System.out.println("录音");
    }

    public static void main(String[] args) {
        NewNewPhone newNewPhone=new NewNewPhone();
        newNewPhone.show();
    }
}