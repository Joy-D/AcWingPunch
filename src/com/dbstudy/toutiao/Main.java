package com.dbstudy.toutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext())
        {
           list.add(sc.nextInt());
        }
        System.out.println(minStep(list));
    }
    private  static int[][] array=new int[100][100];
    private static int minStep(List<Integer> list) {
        int left=5;
        int right=6;
        int count=0;
        int length=list.size();
        int step=0;
        while (length==0){
            int tmp=list.get(count);
            for (int i=0;i<list.size();i++){

            }
        }
        return 0;
    }






    private static int howMuch(long i) {
        int count=0;
        long result=i;
        while (result!=1)
        {
            //result=canSqrt(result);
            result=myMuch(result);
            count++;
        }
        return count;
    }

    private static long myMuch(long result) {
        int jie= (int) Math.sqrt(result);
        if (jie*jie==result){
            return jie;
        }else {
            return result-1;
        }
    }

    private static long canSqrt(long i) {
        long left=0;
        long right=i;
        while (left<=right){
            long mid=left+(right-left)/2;
            if (mid*mid<i){
                left=mid+1;
            }else if(mid*mid>i){
                right=mid-1;
            }else {
                return mid;
            }
        }
        return i-1;
    }
}
