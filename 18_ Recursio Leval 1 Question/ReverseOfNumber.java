
public class ReverseOfNumber {
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    static int rev2(int n) {
        int digit = (int) (Math.log10(n)) + 1; // we using this for count length of the digit
        return helper(n, digit);
    }

    public static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }

    static boolean palin(int n) {
    int reverse  = rev2(n);
        return n ==  reverse ;
    }

    public static void main(String[] args) {
        // rev1(28396);
        // System.out.println(sum);

        // System.out.println(rev2(202849));
        
        int num = 1234321;
        if (palin(num)) {
            System.out.println(num + " Number is Palin: ");
        }else{
            System.out.println(num + " Number is Not Palin: ");
        }
    }

}
