import java.util.*;

public class inputArray {
    public static void main(String[] args) {
        System.out.println("Enter your Array to Print: ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        /*arr[0] = 23;
        arr[1] = 27;
        arr[2] = 24;
        arr[3] = 224;
        arr[4] = 234;
        System.out.println(arr[1]);*/
         
        for (int i = 0 ; i < arr.length ; i++){ // array ko input liya hai "Most Imp if you r using Scanner class:"
            arr [i] = sc.nextInt();
        }

        /*// another method to print Arrays: ===>
        for (int i = 0 ; i< arr.length ; i++){ // after taking input we print array 
            System.out.print(arr[i]+ " ");
        }*/
        for (int num : arr){
            System.out.print(num + " ") ;
        }

    }
}
