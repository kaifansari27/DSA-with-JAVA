public class LEETCODE_167{
    public static void main(String[]args){

    }
    public int towSum(int [] number , int target){
        int left = 0 ;
        int right number.length;

        while(left < right){
            int sum = number[left] + number[right];
            if(sum == target){
                return new int [] {left+1 , right + 1};
            } else if (sum < target){
                left ++;
            } else{
                right --;
            }
        }
        return new int [] {-1 , -1};
    }
}