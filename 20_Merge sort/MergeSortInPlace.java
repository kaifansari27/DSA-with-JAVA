import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length); // sort in-place
        System.out.println(Arrays.toString(arr));
    }

    // In-place merge sort
    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return; // base case
        }

        int mid = (s + e) / 2;

        // sort left and right halves
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        // merge sorted halves
        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s, j = m, k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < m) {
            mix[k++] = arr[i++];
        }

        while (j < e) {
            mix[k++] = arr[j++];
        }

        // copy back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
