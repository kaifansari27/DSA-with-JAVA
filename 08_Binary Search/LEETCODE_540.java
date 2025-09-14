public class LEETCODE_540 {
    public static void main(String[]args){

    }
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // ensure mid is even (pair starts at even index)
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // single element is on the right side
                left = mid + 2;
            } else {
                // single element is on the left side (including mid)
                right = mid;
            }
        }

        return nums[left];
    }
}
