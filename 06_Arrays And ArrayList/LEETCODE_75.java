public class LEETCODE_75 {
    public static void main(String[] args){

    }
    public void sortColor(int [] nums){
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            for( int j = i+1 ; j < n ; j++){
                if( i > j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp ;
                }
            }
        }
    }
}
