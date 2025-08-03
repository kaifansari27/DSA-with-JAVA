
public class NotMatchingNumber {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 69, -3, -2, -4};
        System.out.println(ans(arr));
    }
    public static int ans(int [] arr){
        int notMatching = 0 ;
        for(int n : arr){
            notMatching += n;
        }
        return notMatching;
    }
}
