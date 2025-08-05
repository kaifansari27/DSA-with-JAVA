public class CalculatingPower {
    public static void main(String[] args) {
        int base = 3;
        int power = 6 ;
        int ans = 1 ; 
        while(power > 0){ // we are playing with power so we create this condition
            if((power & 1 ) == 1){
                ans *= base;
            }
            base *= base;
            power = power >> 1 ; // Decrementing the power 
        }
        System.out.println(ans);
    }
}
