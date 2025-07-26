import java.util.*;
public class SumFirstNNum {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        int i = 1 ; // counter
        while (i <= n) {
             sum += i;
             i++;    
        }
        System.out.println("Sum is : " + sum );
          
    }
}
