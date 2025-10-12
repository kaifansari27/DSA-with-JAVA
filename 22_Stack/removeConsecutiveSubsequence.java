import java.util.*;
public class removeConsecutiveSubsequence {
    public static int [] remove( int [] arr){
        int n = arr.length;
        Stack <Integer> st = new Stack<>();
        for( int i = 0 ; i < n ; i++){
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }else if(arr[i] == st.peek()){
                if( i == n-1  || arr[i] != arr[i+1]) st.pop();
            }
        }
        // now put the output(Stack's remaining Elememts) in arrr
        int [] res = new int [st.size()];
        int m = res.length ; // find the size
        // print in reverse for storing in array;
        for (int i = m-1 ; i >= 0 ; i--){
            res[i] = st.pop(); // putting stacks's Elements in res Arrays
        }
        return res;


    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 10, 10, 10, 2, 2, 4, 4, 4,5, 7, 7, 7 };
        int [] res = remove(arr);
        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i] + " ");
        }
    }
}
