 public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 3, 4, 4, 4, 29};
        int target = 3;
        int[] result = firstAndLastPosition(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    static int[] firstAndLastPosition(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
