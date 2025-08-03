 
/*public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isOdd(n));
         
    }
    public static boolean isOdd(int n){
        return (n & 1 ) == 1;
    }
    
}*/


// If you want take input from the user

import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // read as integer, not String

        if (isOdd(n)) {
            System.out.println(n + " is Odd");
        } else {
            System.out.println(n + " is Even");
        }

        sc.close();  // close the scanner
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
