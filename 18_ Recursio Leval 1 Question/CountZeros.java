public class CountZeros {
    public static void main(String[] args) {
        System.out.println("Number of Digit in Your Digit is : " + count(102030));
        //System.out.println(count(203040));
    }
    static int count(int n){
        return helper(n , 0);  // c means count is zero intially
    }
    private static int helper(int n , int c){
        if( n == 0 ){
            return c;  // if number is equal to the zero then return zero
        }
        int rem = n % 10 ;
        if(rem == 0){
            return helper(n/10 , c +1);
        }
        return helper(n/10, c);
    }
}
