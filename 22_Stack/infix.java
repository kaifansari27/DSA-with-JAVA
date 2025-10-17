import java.util.*;
public class infix {
    public static void main(String[] args) {
        String str = "9 - (5 + 3) * 4 / 6 ";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            //  FIX 1: Ignore spaces
            if (ch == ' ')
                continue;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            }
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                //  FIX 2: Add check before peek to avoid EmptyStackException
                while (!op.isEmpty() && op.peek() != '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                }
                // FIX 3: remove '(' safely
                if (!op.isEmpty()) op.pop();
            }
            else {
                if (ch == '+' || ch == '-') {
                    //  FIX 4: check stack empty before peek
                    if (!op.isEmpty()) {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '-') val.push(v1 - v2);
                        if (op.peek() == '+') val.push(v1 + v2);
                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);
                        op.pop();
                    }
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    //  FIX 5: check stack empty before pop
                    if (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);
                        op.pop();
                    }
                    op.push(ch);
                }
                else if (ch != '(' && ch != ')') {
                    op.push(ch);
                }
            }
        }

        //  FIX 6: final evaluation safe check
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);
            op.pop();
        }

        //  FIX 7: print final answer
        System.out.println("Result = " + val.peek());
    }
}
