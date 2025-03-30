package com.mwh.demo.Override;

public class NewPhone extends Phone{
    public void show(){
        super.show();
        System.out.println("打视频");
    }

    public static void main(String[] args) {
        NewPhone newPhone=new NewPhone();
        newPhone.show();
    }

}