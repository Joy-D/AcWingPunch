package com.dbstudy.day03;

public class Solution {
    public static void main(String[] args) {
       int[] nums = new int[]{5};
       int target = 5;
       int[] res=findBeginAndEnd(nums,target);
        System.out.println("["+res[0]+","+res[1]+"]");
    }

    private static int[] findBeginAndEnd(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while (right>=left){
            int mid=left+(right-left)/2;
            if (nums[mid]< target){
                left=mid+1;
            }
            else if(nums[mid] > target){
                right=mid-1;
            }else if (nums[mid]==target){
                int pLeft=mid-1;
                int pRight=mid+1;
                while (pLeft>=left&&nums[pLeft]==target){
                    pLeft--;
                }
                while (pRight<=right&&nums[pRight]==target){
                    pRight++;
                }
                return new int[]{pLeft+1,pRight-1};
            }
        }
        return new int[]{-1,-1};
    }
}
