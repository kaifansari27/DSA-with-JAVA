public class LEETCODE_66 {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1; // e.g., 999 + 1 = 1000
        return result;
    }
}
