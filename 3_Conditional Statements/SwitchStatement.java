import java.util.*;
public class SwitchStatement {
    public static void main(String[] args) {
        int number = 2 ;
        switch (number) {
            case 1 : System.out.println("Samosa");  
                break;
            case 2 : System.out.println("Burger");
                break;
            case 3 : System.out.println("Coffee");  
                break ; 
            default: System.out.println("we woke up");
                break;// if u want , then don't need to write break statment.......
        }
    }
}
