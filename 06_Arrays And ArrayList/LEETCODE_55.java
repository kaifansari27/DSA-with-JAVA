public class LEETCODE_55 {
    public static void main(String[] args){

    }
    public boolean canJump( int [] nums){
        int n = nums.length;
        int maxReach = 0;
        for(int i = 0 ; i < n ; i++){
            if( i > maxReach){  // Matlab ye line if (i > maxReach) check karti hai:"Can I even reach this index or not?"
                return false ;
            }
            // agar pahuch sakte h to update kar denge
            maxReach = Math.max(maxReach , i + nums[i]);
        }
        return true ;
    }
}
