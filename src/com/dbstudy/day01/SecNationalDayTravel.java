package com.dbstudy.day01;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/7/8
 */
public class SecNationalDayTravel {
    public static void main(String[] args) {
        //a[i]+a[j]+i-j=(a[i]+i)+(a[j]-j)  j>i
        int[] array=new int[]{11,6,5,18,12};
        int tmp=array[0]+array[1]-1;
        int max_i=array[0];
        int result=array[0];
        for (int j=1;j<array.length;j++){
          max_i=Max(max_i,array[j-1]+j-1);
          result=Max(max_i+array[j]-j,result);
        }
        System.out.println(result);
    }

    private static int Max(int a, int b) {
        return a>b?a:b;
    }
}
