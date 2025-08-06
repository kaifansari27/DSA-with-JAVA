public class Factor {
    public static void main(String[] args) {
        System.out.println(factor(20));
    }
    public static int factor(int n){
        for (int i = 1 ; i < n; i++) {
            if( n % i == 0){
                System.out.print(i +  " ");
            }
        }
        return n;
    }
}
