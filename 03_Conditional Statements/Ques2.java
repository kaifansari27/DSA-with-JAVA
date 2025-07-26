import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        if (number % 2  == 0){
            System.out.println("Number is EVEN :" + number);
        }
        else{
            System.out.println("Number is ODD: " + number);
        }
        sc.close();
    }
}
