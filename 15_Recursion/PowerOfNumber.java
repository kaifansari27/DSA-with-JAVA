import java.util.*;
public class PowerOfNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int a = sc.nextInt();
        System.out.println("Enter the value of Exponent: ");
        int b = sc.nextInt();
        System.out.println(a + " "+ "to the power of" + " " + b + " " + "is" + " " + pow(a , b));
    }
    public static int pow(int a , int b){
        if ( b == 0 ) return 1;
        int call = pow(a , b/2);
        if( b % 2 == 0) return call*call; // if exponent is even
        else return a*call*call; // we multiply 'a' because when b is odd 
    }
}
