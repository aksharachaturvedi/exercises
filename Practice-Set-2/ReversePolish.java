package LeetCode;

import java.util.Stack;

/**
 * Created by rbabbar on 8/21/14.
 */
public class ReversePolish {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<String>();
        String operators = "+-*/";

        for (String t : tokens) {
            if (!operators.contains(t)) {
                st.push(t);
            } else {
                int x = Integer.valueOf(st.pop());
                int y = Integer.valueOf(st.pop());
                int index= operators.indexOf(t);
                switch (index) {
                    case 0: // "+":
                        st.push(String.valueOf(x + y));
                        break;
                    case 1://"-":
                        st.push(String.valueOf(y - x));
                        break;
                    case 2://"*":
                        st.push(String.valueOf(x * y));
                        break;
                    case 3://"/":
                        if (x != 0) {
                            st.push(String.valueOf(y / x));
                        }
                        break;
                }
            }

        }
        return Integer.valueOf(st.pop());

    }
}