import java.util.*;
public class functionWithParameter {
    
    public static int Calculatesum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Two Number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calculatesum(a,b);
        System.out.println("sum is : " + sum);
    }
    
}
