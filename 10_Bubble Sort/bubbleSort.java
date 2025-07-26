import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {27, 23, 34, 32, 54, 24, 98, 69};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        boolean swapped ;
        for(int i = 0; i < arr.length ; i++){
            swapped = false;
            for(int j = 1 ; j < arr.length - i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                    swapped = true ;
                } 

            }
            // when don't occure any swap in array means array is sorted then end your program
            if(! swapped ){
                break;
            }
        }
    }
}
