import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        System.out.println("Enter your Array: ");
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        // one way to get output :
        for(int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
         
    }
}
