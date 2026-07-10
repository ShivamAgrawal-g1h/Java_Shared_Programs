package Library.Stack;

import java.util.ArrayDeque;

class Q1_BalancedParanthesis {
    public boolean isValid(String s) {
        int n = s.length();
        //Stack<Character> st = new Stack<>();
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == '{'){
                st.push(ch);
            }
            else if(ch == '['){
                st.push(ch);
            }
            else if(ch == ')'){
                if(!st.isEmpty() && st.peek() == '(') st.pop();
                else return false;
            }
            else if(ch == '}'){
                if(!st.isEmpty() && st.peek() == '{') st.pop();
                else return false;
            }
            else{ // ch == ']'
                if(!st.isEmpty() && st.peek() == '[') st.pop();
                else return false;
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}
