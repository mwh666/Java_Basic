package com.mwh.demo.Basic;

public class Shuzhu {

    public static void main(String[] args) {

        int arr[] ={1,2,3};
        int arr1[] ={4,5,6};

        int[] arr12 =new int[6];
        //合并两个数组
        int length = arr.length+arr1.length;

        int anyArr[]=new int[length];

        arr12=arr.clone();


        for (int i = 0;i<=arr12.length;i++){
            System.out.println(arr12[i]);
        }
    }



}