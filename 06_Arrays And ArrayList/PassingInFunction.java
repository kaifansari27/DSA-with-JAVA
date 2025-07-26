import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] num = { 20, 28, 27, 15, 65 };
        System.out.println(Arrays.toString(num));
        System.out.println("Array is Changed:");

        change(num);
        System.out.println(Arrays.toString(num));
    }

    public static void change(int[] arr) {
        arr[3] = 69;
    }

}
