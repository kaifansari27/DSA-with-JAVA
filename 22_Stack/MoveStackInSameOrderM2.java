import java.util.*;

public class MoveStackInSameOrderM2 {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        // using Stack 2 for reverse 

        Stack <Integer> gt = new Stack<>();
        while(gt.size() > 0 ){
            gt.push(st.pop());
        }

        //  using 3rd Stack when it become in same order

        Stack <Integer>  rt = new Stack<>();
        while(rt.size() > 0){
            rt.push(gt.pop());
        }
        System.out.println(st);
    }
}
