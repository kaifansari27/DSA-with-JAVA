import java.util.*;

public class MoveStackInReverseOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(40);
        st.push(50);
        System.out.println(st);

        // Reverse Order

        Stack <Integer> rt = new Stack<>();
        while(st.size()> 0){
            rt.push(st.pop());
        }
        System.out.println(rt);
    }
}
