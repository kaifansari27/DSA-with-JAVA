
public class MinimumInArray {
    public static void main(String[] args) {
        int [] arr = {29, 3, 23, -29, -9, 20};
        System.out.println(min(arr));
    }
    static int min(int [] arr ){
        int minVal = arr[0]; //// 0 is index value not the value...
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
