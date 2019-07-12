package com.dbstudy.day02;

import java.util.Scanner;

/**
 * Question :
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 */

class Solution{
public static int searchInsert(int[] nums, int target) {
    int left=0;
    int right=nums.length-1;
    while (left<right){
        int mid=left+(right-left)/2;
        if (nums[mid]<target){
            left=mid+1;
        }else if (nums[mid]>target){
            right=mid-1;
        }else if(nums[mid]==target){
            return mid;
        }
    }
    return right+1;
}

    public static void main(String[] args) {
        int[] a=new int[]{1,3,5,6};
        int target=2;
        System.out.println(searchInsert(a,2));
}
}
public class FindIndex {
    public static void main(String[] args) {
        int[] array=new int[]{1,3,5,6};
        int num=2;
        System.out.println(findIndex(array,num));
    }

    private static int findIndex(int[] array, int num) {
        int left=0;
        int right=array.length-1;
        int pLeft=(left+right)/2;
        int pRight=(left+right)/2+1;
        if (array[right]<num){
            return right+1;
        }
        while(true){
            if (pLeft<0){
                pLeft=pRight;
            }
            if (array[pLeft]>num){
                right=pLeft;
            }else if (array[pRight]<num){
                left=pRight;
            }else if (array[pLeft]<num&&array[pRight]>num){
                return pRight;
            }else if (array[pLeft]==num){
                return pLeft;
            }else if (array[pRight]==num){
                return pRight;
            }
            pLeft=(left+right)/2;
            pRight=(left+right)/2+1;
        }
    }
}