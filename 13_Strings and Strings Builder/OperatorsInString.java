import java.util.ArrayList;

public class OperatorsInString {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 28);
        System.out.println((char)('a' + 1));
        System.out.println("a"+ 27);
        System.out.println("kaif" + new ArrayList<>());
        System.out.println("kaif" + new Integer(56));
        String ans = new ArrayList<>() + " " + new Integer(69);
        System.out.println(ans);
    }
}
