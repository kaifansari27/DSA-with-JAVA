import java.util.*;

public class AvgOfNumber {
    /*
     * public static int avg(int a , int b , int c){
     * return (a + b+ c)/3;
     * }
     * public static void main(String[] args) {
     * int a = 10 , b = 20 , c = 30 ;
     * int result = avg(a , b, c);
     * System.out.println("Average of The number is : " + result );
     * }
     */


     // Calculating avg using Scanner......



    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter second Number: ");
        double y = sc.nextDouble();
        System.out.println("Enter third number: ");
        double z = sc.nextDouble();
        System.out.println("Average of the Number is = " + avg(x, y, z));

    }
    public static double avg(double x , double y , double z) {
        return (x+y+z)/3;
    }
}
