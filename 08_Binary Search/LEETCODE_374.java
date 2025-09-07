public class LEETCODE_374 {
    public static void main(String[] args) {
        
    }
    public int guessNumber( int n ){
        int left = 1 ;
        int right = n;
        while(left <= right ){
            int mid = left + (right - left) / 2 ;
            int g = guess(mid);
            if (g == 0){
                return mid ;
            } else if( g == 1){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
