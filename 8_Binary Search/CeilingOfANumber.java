public class CeilingOfANumber {
    public static void main(String[] args) {
        int [] arr = {-19, -11 , -4, 0, 2, 4, 6, 27, 38, 100};
        int target = 69;
        int result = ceilingNumber(arr , target);
        System.out.println(result);
    }
    static int ceilingNumber(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1 ;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
