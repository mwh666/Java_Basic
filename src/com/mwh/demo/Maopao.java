package com.mwh.demo;

public class Maopao {

    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 345, 78, 56};
        int max = 0;
        //for(int i=0;i<arr.length;i++)

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){

                if (arr[j] > arr[j + 1]) {
                    max = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = max;
                }
            }
        }

        for(int i1=0;i1<arr.length;i1++) {
            System.out.print(arr[i1]+"\t");
        }



    }
}