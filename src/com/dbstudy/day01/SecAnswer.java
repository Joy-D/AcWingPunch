package com.dbstudy.day01;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/7/8
 *    解法二：利用循环来模拟递归的过程
 */
public class SecAnswer {
    public static void main(String[] args) {
        Double x=new Double(6.0);
        Double right=x;
        Double left=0.0;
        Double tmp=(left+right)/2;
        int count=10;
        while (tmp*tmp!=6.0&&count>0){
            if(tmp*tmp>6.0){
                right=tmp;
                tmp=(left+right)/2;
                count--;
            }else if(tmp*tmp<6.0){
                left=tmp;
                tmp=(left+right)/2;
                count--;
            }
        }
        System.out.println("tmp的值为："+tmp);
    }
}
