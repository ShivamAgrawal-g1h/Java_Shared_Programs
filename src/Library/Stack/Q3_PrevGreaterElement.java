package Library.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;

class Q3_PrevGreaterElement {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            if(st.isEmpty()) al.add(-1);
            else al.add(st.peek());
            st.push(arr[i]);
        }
        return al;
    }
}
