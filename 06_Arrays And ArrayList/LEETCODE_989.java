public class LEETCODE_989 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> result = new ArrayList<>();
            int i = num.length - 1;

            while (i >= 0 || k > 0) {
                if (i >= 0) {
                    k += num[i]; // add digit from num to k
                    i--;
                }
                result.add(k % 10); // store last digit
                k /= 10; // remove last digit
            }

            Collections.reverse(result); // reverse because we added from last digit
            return result;
        }
    }

}
