public class BSWithRecurrence {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8, 12, 14, 18, 90, 100};
        int target = 90;
        System.out.println(search(arr, target , 0 , arr.length-1));
    }
    static int search(int[] arr , int target , int s , int e){
        if(s>e){
            return -1;
        }
        int mid  = s + (e - s) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]< target){
            return search(arr, target, mid+1, e);
        }
        return search(arr, target, s, mid-1);
    }
}
