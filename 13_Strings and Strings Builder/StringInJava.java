public class StringInJava {
    public static void main(String[] args) {
        String a = "kaif";
        String b = "kaif";
        String c = a;
        System.out.println(c==a);
        System.out.println(a==b);

        // we are making new String 
        String name1 = new String("kaif");
        String name2 = new String("kaif");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2)); // we are only camparing the values...

        // for finding the index value of Character 
        System.out.println(name1.charAt(0));
    }
}
