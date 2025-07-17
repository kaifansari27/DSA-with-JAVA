import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("N is prime ");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % 2 == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Number is prime : " + n);
            } else {
                System.out.println("Number is not Prime :" + n);
            }

        }

    }
}
