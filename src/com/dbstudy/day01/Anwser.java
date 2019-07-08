package com.dbstudy.day01;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/7/8
 * Day01   求平方根（二分法）
 */
public class Anwser {
    public static void main(String[] args) {
        Double x = new Double(6.0);
        System.out.println(Sqrt(0.0,x));
    }
    public static double Sqrt(double left,double right){
        double tmp=(left+right)/2.0;
        if(tmp*tmp== 6){

            return tmp;
        }
        else if(tmp*tmp > 6){
            return Sqrt(left,tmp);
        }else if(tmp*tmp < 6){
            return Sqrt(tmp,right);
        }
        return tmp;
    }
}
