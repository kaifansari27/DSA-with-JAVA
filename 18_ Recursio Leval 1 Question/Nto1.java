
public class Nto1 {
    public static void main(String[] args) {
        fun(8);
    }
    static void fun(int n){
        if(n == 0){
            return; // return nothing 
        }
        System.out.print(n + " ");
        fun(n-1);
    }
}
