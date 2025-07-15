import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("age");
        input.close();
    
    }
}
