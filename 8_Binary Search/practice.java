public class practice {
     public static void main(String [] args){
         int [] arr = {-18, -16, 3, 4, 5, 6, 8, 35, 49, 60, 233}; 
         int target = 35;
         int ans = binarySearch(arr , target);
         System.out.println(ans);
         int maxVal = max(arr);
         System.out.println(maxVal);
         int minVal = min(arr);
         System.out.println(minVal);
     }
     static int binarySearch(int [] arr , int target ){
         int start = 0 ;
         int end = arr.length -1 ;
         while(start<=end){
             int mid = start + (end - start) / 2 ;
             if (target < arr[mid]){
                 end = mid -1 ;
             }else if(target > arr[mid]){
                 start = mid + 1;
             }
             else {
                 return mid;
             }
         }
         return -1;
     }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i ++ ){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
}