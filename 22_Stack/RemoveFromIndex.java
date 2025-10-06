import java.util.*;

public class RemoveFromIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();

        while (st.size() > 2) {
            rt.push(st.pop());
        }
        st.pop();

        while (rt.size()> 0 ) {
            st.push(rt.pop());
        }
        System.out.println(st);
    }

}
