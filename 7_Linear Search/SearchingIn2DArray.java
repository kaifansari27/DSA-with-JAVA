import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
            {29 ,49 ,23, 29, 10},
            {34, 22, 87, 49},
            {30, 45, 24, 223, 23},
            {27, 28},
        };
        int target  = 27 ;
        int [] ans = search (arr , target);
        System.out.println(Arrays.toString(ans));
        int maxVal = max(arr);
        System.out.println(maxVal);
    }
    // for finding index value of the arrays
    static int[] search (int [][] arr , int target){
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                if (arr[row][col] == target){
                    return new int [] {row , col};
                }
            }
        }
        return new int []{-1 , -1};
    }
    // for findind Maximun value in the arrays
    static int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                if (arr [row][col]> max){
                    max = arr [row][col];
                }
            }
        }
        return max;
    }
}
