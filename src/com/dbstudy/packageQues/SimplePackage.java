package com.dbstudy.packageQues;

import java.util.Scanner;

import static java.lang.Integer.max;

public class SimplePackage {
    private static int[] jia=new int[]{0,3,4,5,8,10};
    private static int[] wei=new int[]{0,2,3,4,5,9};
    public static void main(String[] args) {
        //System.out.println(f(4,20));
        bigPackage();
    }

    /**
     * 递归写法
     */
    private static int f(int i, int j) {
        if (i<0){
            return 0;
        }
       if (j<wei[i]){
           return f(i-1,j);
       }else {
           return max(f(i-1,j-wei[i])+jia[i],f(i-1,j));
       }
    }
    /**
     * 动规写法
     */
    private static int[][] max=new int[6][21];
    public static int bigPackage(){
        int maxJia=0;

        for (int i=1;i<6;i++){
            for (int j=1;j<21;j++){
                if (j < wei[i]){
                    max[i][j]=max[i-1][j];
                }else{
                    max[i][j]= Max(max[i-1][j-wei[i]]+jia[i],max[i-1][j]);
                }
            }
        }
        for (int i=0;i<6;i++){
            for (int j=0;j<21;j++){
                System.out.print(max[i][j]+"    ");
            }
            System.out.println();
        }
        return 0;
    }

    private static int Max(int a,int b) {
        return a>b?a:b;
    }
}
