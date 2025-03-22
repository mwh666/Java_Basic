package com.mwh.demo.Basic;

public class Erfen_Chazhaofa {


    /**
     *  定义坐标的边界
     *  默认： 左边边界 0  右边边界是 最大角标
     *  取出数组中间的值 和要查找的数字比较，
     *  相等： 找到了
     *  中间值 < 查找的值
     *  只找数组的右边  左边边界 = 中间值的角标 + 1
     *  中间值 > 查找的值
     *  只招数组的左边  右边边界 = 中间值角标 -1
     *
     */

        public static int binarySearch(int[] arr, int target) {
            int left = 0, right = arr.length - 1;  // 起始坐标 结束坐标

            while (left <= right) {
                int mid = left + (right - left) / 2; // 避免溢出
                if (arr[mid] == 6) {
                    return mid; // 找到目标值
                } else if (arr[mid] < 6) {
                    left = mid + 1; // 搜索右半部分
                } else {
                    right = mid - 1; // 搜索左半部分
                }
            }
            return -1; // 未找到目标值
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 5,6, 7, 9};
            int target = 6;

            int result = binarySearch(arr, target);
            if (result != -1) {
                System.out.println("目标值 " + target + " 的索引是：" + result);
            } else {
                System.out.println("目标值 " + target + " 不在数组中。");
            }
        }
    }