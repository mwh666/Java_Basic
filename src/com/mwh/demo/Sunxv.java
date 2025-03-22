package com.mwh.demo;

public class Sunxv {

    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 345, 78, 56};

        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                  max=arr[j];
                  arr[j]=arr[i];
                  arr[i]=max;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}