import java.util.*;
public class oneToN {
    public static void main(String[] args) {
        System.out.println("Enter Your Range (1 - n)");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.print(counter + " ");
            counter ++;
            
        }
        System.out.println("Your number is printed: ");
    }
}
