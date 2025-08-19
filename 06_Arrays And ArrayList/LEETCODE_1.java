public class LEETCODE_1 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // dono index return karne h
                }
            }
        }
        return new int[] {}; // agar kuch na mile to empty array
    }
}
