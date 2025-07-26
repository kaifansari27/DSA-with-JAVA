import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the possible Ineger: ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (isEven(num)){
            System.out.println("Number is Even: ");
        }
        else{
            System.out.println("Number is Odd:");
        }

    }
    public static boolean isEven(int num){
        if(num % 2== 0){
            return true ;
        }
        else {
             return false;
        }
    }
}
