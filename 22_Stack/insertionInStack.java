import java.util.*;

public class insertionInStack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <> ();
        st.push(12);
        st.push(45);
        st.push(18);
        st.push(10);
        System.out.println(st); // [12, 45, 18, 10]

        int idx = 2 ; //At this index
        int x = 7 ; // value of the element

        Stack <Integer> temp = new Stack<>();
        while(st.size() > idx){
            temp.push(st.pop()); // place is Create where we insert the given value
        }
        st.push(x) ; // and then place at u create 

        // now we gonna bring element temp to st

        while(temp.size() > 0 ){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
