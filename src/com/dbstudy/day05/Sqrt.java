package com.dbstudy.day05;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/7/13
 *思路：如果中间的数小于最右边的数，
 * 则右半段是有序的，
 * 若中间数大于最右边数，
 * 则左半段是有序的，
 * 我们只要在有序的半段里用首尾两个数组来判断目标值是否在这一区域内，
 * 这样就可以确定保留哪半边了
 */
public class Sqrt {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long x=sc.nextInt();
//        System.out.println(findSqrt(x));
        int[] nums=new int[]{4,5,6,7,0,1,2};
        System.out.println(findNum(nums,0));
        //System.out.println(findMin(nums));
    }

    private static int findNum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < nums[right]){
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }else{
                if(nums[left] <= target && target < nums[mid])
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
        }
        return -1;
    }

    public static int findMin(int[] nums) {
        if (nums.length<=0){
            return -1;
        }
        if (nums.length==1){
            return nums[0];
        }
        int tmp1=0;
        int tmp2=1;
        while (tmp2<nums.length){
            if(nums[tmp2]<nums[tmp1]){
                return nums[tmp2];
            }else{
                tmp2++;
                tmp1++;
            }
        }
        return nums[0];
    }

    private static int findSqrt(long x) {
        if (x==0){
            return 0;
        }
        long left=0;
        long right=x;
        while (left<=right){
            long mid=left+(right-left)/2;
            if (mid*mid<x){
                left=mid+1;
            }else if(mid*mid>x){
                right=mid-1;
            }else {
                return (int)mid;
            }
        }
        return (int)(left-1);
    }
}
