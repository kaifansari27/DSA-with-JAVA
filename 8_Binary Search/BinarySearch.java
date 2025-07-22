
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-18, -16, -4, 0, 2, 3, 4, 14, 16, 27, 28, 39, 69};
        int target = -18;
        int ans = binarySearch(arr , target);
        System.out.println(ans);
    }
    public static int binarySearch(int []arr , int target){
        int start = 0;
        int end = arr.length - 1 ;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
