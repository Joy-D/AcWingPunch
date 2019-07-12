package com.dbstudy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array=new int[]{1,3,5,6};
        int target=5;
        int res=myBinarySearch(array,target);
        //System.out.println(binarySearch(array,target,3));
        System.out.println(res);
    }
    public static int binarySearch(int[] A, int target, int n){
        int low = 0, high = n, mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(A[mid] == target){
                return mid;
            }else if(A[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int myBinarySearch(int[] array,int target){
        int left=0;
        int right=array.length-1;
        while (left<=right){
            //防止溢出
            int mid=left+(right-left)/2;
            if (array[mid]>target){
                right=mid-1;
            }else if(array[mid]<target){
                left=mid+1;
            }else if (array[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}
