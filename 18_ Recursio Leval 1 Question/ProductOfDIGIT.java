
public class ProductOfDIGIT {
    public static void main(String[] args) {
        System.out.println(product(2728));
    }
    static int product(int n ){
        if(n % 10 == n){
            return n;
        }
        return product(n / 10) * (n % 10);
    }
}
