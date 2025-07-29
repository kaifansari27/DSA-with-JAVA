import java.util.Arrays;
public class MethodInString {
    public static void main(String[] args) {
        String name = "Kaif Ansari";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('i'));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("Kaif" .strip());
    }
}
