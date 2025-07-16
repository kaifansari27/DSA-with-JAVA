import java.util.*;

public class Ques {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers: a and b ");
        Scanner sc = new Scanner(System.in);
        
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        
        //int a = 20 ;
        //int b = 10 ;
        if (a>b){
            System.out.println("a is largest of 2 : " +a);
        }
        else{
            System.out.println("b is largest of 2 :"+b);
        }
    }
}
