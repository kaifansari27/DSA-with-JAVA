public class FOusingDataType {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;

    }

    public static void main(String[] args) {
        System.out.println("Sum is : ") ;
        System.out.println(sum(20, 7));
        System.out.println(sum(27.7f, 28.8f));
    }
}
