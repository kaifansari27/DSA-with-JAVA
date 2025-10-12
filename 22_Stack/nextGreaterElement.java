public class nextGreaterElement {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int [] res = new int[arr.length]; // result (output store karne ke liye)
        for(int i = 0 ; i < arr.length ; i++){
            res[i] = - 1; // jab kisi element ka next greater element present na ho
            for(int j = i + 1 ; j< arr.length ; j++){
                if(arr[j] > arr[i]){
                    res[i] = arr[j]; // to ressult me arr[j] ko store kar dena....
                    break;
                }
            }
        }
        // Printing Original Array
        for(int i = 0 ; i < arr.length; i++ ){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        // printing Output Array
        for(int i = 0 ; i < res.length; i++){
            System.out.print( res[i] + " " );
        }
    }
}
