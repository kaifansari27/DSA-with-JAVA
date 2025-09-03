public class LEETCODE_1539 {
    public static void main(String[] args) {

    }
    // optimize Solution
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left(right - left) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + k;

    }
}

// brute force 

/*class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length ;
        
        for(int i = 0 ; i < n ; i ++){
            int nmt = arr[i] - (i + 1);   // number of missing till arr[i]

            if(nmt < k) continue;
            else {
                return arr[i] - (nmt - k + 1);
            }
        }
        
        // agar loop me answer nahi mila, iska matlab
        // missing number array ke baad hai
        return n + k;
    }
}*/

