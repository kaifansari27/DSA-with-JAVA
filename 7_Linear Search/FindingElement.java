
public class FindingElement {
    public static void main(String[] args) {
        int [] nums = {12, 44, 4, 24, 29, 230};
        int target = 4 ;
        int ans = linearSearch(nums , target);
        System.out.println(ans);
    }
    public static int linearSearch(int [] arr , int target){
        if (arr.length ==0){
            return -1; 
        }
        for (int i = 0 ; i < arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}
