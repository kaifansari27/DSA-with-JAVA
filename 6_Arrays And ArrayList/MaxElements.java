public class MaxElements {
    public static void main(String[] args) {
        System.out.println("Max Element is Printed: ");
        int[] arr= {1, 23, 27, 49, 28, 269};
        System.out.println(max(arr));
    }
    static int max (int[] arr){
        int maxVal = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr [i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
