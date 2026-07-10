package Library.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;

class Q2_StockSpan {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        // if(n==0) return al;
        // for(int i = 0; i<n; i++){
        //     int count = 0;
        //     for(int j = i; j>=0; j--){
        //         if(arr[j] <= arr[i]) count++;
        //         else break;
        //     }
        //     al.add(count);
        // }


        // Method - 2 : T.C. = theta(n) , A.S. = O(n)
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(0);
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            if(st.isEmpty()) al.add(i+1);
            else al.add(i-st.peek());
            st.push(i);
        }
        return al;
    }
}
