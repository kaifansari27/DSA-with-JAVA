
public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 56, 54, 65, 27, 24, 98, 25 };
        int target = 27;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 2; i < 7; i++) {
            // check for element at every index
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
