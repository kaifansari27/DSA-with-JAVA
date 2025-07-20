import java.util.*;
import java.util.Arrays;
public class ArrayOfObject {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        //  Array of Object 
        String [] str = new String[5];
        System.out.println("Enter your String Arrays : ");
        for (int i = 0 ; i < arr.length ; i++){
            str[i]= sc.next();
        }
        System.out.println(Arrays.toString(str));

        // modify 
        str [3] = "Kaif Ansari";
        System.out.println(Arrays.toString(str));
    }
    
}
