import java.util.Arrays;

public class CycclicSort {
    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 3, 5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int []arr){
        int i = 0;
        while(i< arr.length){
            // check that element are at position
            int correct = arr[i] -1 ;
            if(arr[i] != arr[correct]){
                // if element is not at correct position then swap it nnnn buddy
                int temp = arr[correct];
                arr[correct]= arr[i];
                arr[i] = temp;
            }else{
                // if you are not swapping then move forword n 
                i++;
            }
        }
    }
}
