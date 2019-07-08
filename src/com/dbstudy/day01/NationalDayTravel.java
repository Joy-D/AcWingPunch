package com.dbstudy.day01;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/7/8
 * Question 863:
 * 小明国庆节来北京玩，北京有N个景点，第 i 个景点的评分用a[i]表示，两个景点i, j之间的距离为j - i(j > i)。
 * 小明一天只能游玩两个景点，我们认为总评分是两个景点的评分之和减去两个景点之间的距离，即为a[i]+a[j]+i-j。
 * 那么小明选择哪两个景点才会总评分最大呢？
 */
public class NationalDayTravel {
    public static void main(String[] args) {
        //a[i]+a[j]+i-j=(a[i]+i)+(a[j]-j)  j>i
        int[] array=new int[]{11,6,5,18,12};
        int tmp=array[0]+array[1]-1;
        int result=0;
        for (int j=1;j<array.length;j++){
            tmp=0;
            for (int i=0;i<j;i++){
                tmp=Max(array[i]+i+array[j]-j,tmp);
            }
            result=Max(result,tmp);
        }
        System.out.println(result);
    }

    private static int Max(int a, int b) {
        return a>b?a:b;
    }
}
