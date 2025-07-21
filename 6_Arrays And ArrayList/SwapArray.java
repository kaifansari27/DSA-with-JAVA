import java.util.Arrays;
public class SwapArray {
    public static void main(String[] args) {
        int [] arr = {1, 23, 28, 49, 27, 269};
        swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[] , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
