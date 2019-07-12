package com.dbstudy.toutiao;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++)
        {
            System.out.println(canSqrt(array[i]));
        }
    }

    private static int canSqrt(int tmp) {
            int x=0;
            while (x<tmp*tmp){
                if(can(tmp+x))
                {
                    return x;
                }
                x++;
            }
            return -1;

    }

    private static boolean can(int i) {
        long left=0;
        long right=i;
        while (left<=right){
            long mid=left+(right-left)/2;
            if (mid*mid<i){
                left=mid+1;
            }else if(mid*mid>i){
                right=mid-1;
            }else {
                return true;
            }
        }
        return false;
    }
}
