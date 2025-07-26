import java.util.*;
public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter Your Possible Integer: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1 ;
        for (int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        System.out.println("Factorial of the number is :" + fact);
    }
    
}
