import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(34);
        list.add(38);
        list.add(45);
        list.add(40);
        System.out.println(list);

        list.set(0, 69); // set.list ---> For changing the element
        System.out.println(list);

        // for removing element
        list.remove(3);
        System.out.println(list);

        // for adding Any number at at required place....

        list.add(3 ,100);
        System.out.println(list);

    }

}
