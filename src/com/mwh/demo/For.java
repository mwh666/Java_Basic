package com.mwh.demo;

public class For {

    public static void main(String[] args) {
        /* for(int i = 1;i<=9;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        } */

        /* for(int i = 1;i<=9;i++){
            for(int j =9;j>=i;j--){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        } */

        for(int i=9;i>=1;i--){
            for (int x=9;x<=1;x--){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }


    }
}