 
public class CallByValue {
    public static void swap(int a, int b){
        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
    public static void main(String[] args) {
        int a = 27 ;
        int b = 28 ;
        swap(a, b);
    }
}
