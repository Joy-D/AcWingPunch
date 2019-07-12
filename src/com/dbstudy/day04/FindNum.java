package com.dbstudy.day04;

public class FindNum {
    public static void main(String[] args) {
        int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target=3;
        System.out.println(isExistence(matrix,target));
    }

    private static boolean isExistence(int[][] matrix, int target) {
        if (matrix.length==0||matrix==null){
            return false;
        }
        int n=matrix[0].length;
        int m=matrix.length;
        int i=m-1;
        int j=0;
        while (i>=0&&j<=n-1)
        {
            if (target<matrix[i][j]){
                i--;
            }
            else if (target>matrix[i][j]){
                j++;
            }else {
                return true;
            }
        }
        return false;
    }
}
