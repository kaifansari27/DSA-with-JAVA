import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        System.out.println("Enter the Year :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("this is the leap year");
        }
        else{
            System.out.println("this is not leap year");
        }
    }
}
