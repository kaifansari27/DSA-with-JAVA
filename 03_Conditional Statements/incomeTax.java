import java.util.*;
public class incomeTax {
    public static void main(String[] args) {
        System.out.println("Enter the Amount of Money");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if (income<=500000){
            System.out.println("O % tax on You");
        } 
        else if (income > 500000 && income < 1000000){  //we can use only "if" in this line
            System.out.println("20 % tax on You");
        }
        else {
            System.out.println("30 % tax on You");
        }
        sc.close();
    }
}
