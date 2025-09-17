public class LEETCODE_1304 {
    public static void main(String[] args) {

    }

    public int[] sumZero(int n) {
        int[] res = new int[n];
        int num = 1;

        // fill pairs (+num, -num)
        for (int i = 0; i < n / 2; i++) {
            res[i] = num;
            res[n - 1 - i] = -num;
            num++;
        }

        // if n is odd, middle element stays 0 by default
        return res;
    }
}
