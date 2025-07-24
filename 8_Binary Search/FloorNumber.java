public class FloorNumber {
    public static void main(String[] args) {
        int [] arr = {-12, -10, -8, 0, 3, 4, 11, 18, 27, 28, 30, 32, 100 };
        int target = 26;
        int result = floorNumber(arr , target);
        System.out.println(result);
        
    }
    static int floorNumber(int [] arr , int target){
        int start = 0;
        int end = arr.length -1 ;
        if (target > arr[end] ){
            return -1 ;
        }
        while(start <= end){
            int mid = start + (end - start) /2 ;
            if(target < arr[mid]){
                end = mid - 1 ;

            }else if (target > arr[mid]){
                start = mid + 1 ;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
