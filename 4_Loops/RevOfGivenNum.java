import java.util.*;
public class RevOfGivenNum {
    public static void main(String[] args) {
        System.out.println("Enter the number for Reverse: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0 ;
        while ( counter<n) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
            
        }
        System.out.println();
    }
}
 