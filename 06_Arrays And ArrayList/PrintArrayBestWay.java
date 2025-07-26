import java.util.*;
public class PrintArrayBestWay {
    public static void main(String[] args) {
        System.out.println("Enter Your Array to Print:");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [5];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}
