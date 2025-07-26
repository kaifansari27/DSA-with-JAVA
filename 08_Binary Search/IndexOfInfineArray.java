public class IndexOfInfineArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 12, 14, 16, 19, 23, 29, 32, 36, 100 };
        int target = 32;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
            if (end >= arr.length) {
                end = arr.length - 1;
            }

        }
        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
