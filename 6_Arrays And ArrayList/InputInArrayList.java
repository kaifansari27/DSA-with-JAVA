import java.util.*;
public class InputInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Arrays: ");
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            list.add(sc.nextInt());
        }
        for(int i= 0 ; i < 5 ; i ++){// get item at any index.....
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
