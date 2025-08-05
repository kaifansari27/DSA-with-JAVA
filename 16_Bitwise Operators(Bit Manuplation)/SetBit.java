public class SetBit {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(Integer.toBinaryString(n));
        System.out.println("Total Number of Set Bit is : " + setBit(n));
    }
    public static int setBit(int n ){
        int count = 0;
        while (n > 0 ) {
            count ++;
            n = n & (n - 1);
        }
        return count ;
    }
}
