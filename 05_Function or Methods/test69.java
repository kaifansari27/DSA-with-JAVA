import java.util.*;
public class test69 {
    public static int prod (int num1 , int num2){
        return num1 * num2 ;
    }
    public static void main(String[] args) {
        System.out.println("Enter any two possible number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = prod(num1, num2);
        System.out.println("a * b = " + result);
    }
}
