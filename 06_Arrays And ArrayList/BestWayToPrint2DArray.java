import java.util.*;
public class BestWayToPrint2DArray {
    public static void main(String[] args) {
        System.out.println("Enter Your Array :");
        Scanner sc = new Scanner(System.in);
        int [][] arr= new int [3][3];
        for (int row = 0 ; row < arr.length ; row ++ ){
            for (int col = 0 ; col < arr[row].length ; col ++){
                arr [row][col] = sc.nextInt();
            }
            
        }
        for (int row = 0 ; row < arr.length ; row ++){
            System.out.println(Arrays.toString(arr[row]));
        }
        

    }
}
