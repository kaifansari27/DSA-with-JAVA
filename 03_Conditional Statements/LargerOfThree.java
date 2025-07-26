import java.util.*;
public class LargerOfThree {
    public static void main(String[] args) {
        System.out.println("Enter the Your Three Numbers: ");
        Scanner sc = new Scanner(System.in);
        //int a = 10 , b = 3 , c = 20 ; 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Largest is a:" +a);
        }
        else if (b>c){
            System.out.println("Largest is b:" +b);
        }
        else{
            System.out.println("Largest is c:" +c);
        }
    }
}
