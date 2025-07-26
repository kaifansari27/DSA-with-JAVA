
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {-19, -13, -9, -7, 2, 4, 5, 23, 45, 67, 99};
        int target = 23;
        int ans = orderAgnosticBS(arr ,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int [] arr , int target){
        int start = 0;
        int end = arr.length -1 ;
        boolean isASC = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if(arr[mid] == target){
                return mid;
            }
            if(isASC){
                if (target < arr[mid]){
                    end = mid -1 ;
                }else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]){
                    end = mid -1 ;
                }else {
                    start = mid + 1;
                }
            }
            
            
        }
        return -1;
    }
}
