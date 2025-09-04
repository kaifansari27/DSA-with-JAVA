public class LEETCODE_41 {
    public static void main(String[] , args) {

    }

    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            // [i] > 0 bcoz we ignore "negative value"
            // arr[i] <= arr.length -- size should be "n"
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {                                                                                
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // finding first mising number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;

            }
        }
        return arr.length + 1;
    }

    // now we gonna swapping the number...
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
