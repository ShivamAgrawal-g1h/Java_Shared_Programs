package Library.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

class Q4_NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int n = arr.length;
        st.push(arr[n-1]);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        for(int i = n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            if(st.isEmpty()) al.add(-1);
            else al.add(st.peek());
            st.push(arr[i]);
        }

        Collections.reverse(al);
        return al;
    }


    // public ArrayList<Integer> nextLargerElement(int[] arr) {
    //     ArrayList<Integer> al = new ArrayList<>();
    //     for(int i=0; i<arr.length ; i++)
    //     {
    //         int greater = -1;
    //         for(int j=i+1; j<arr.length ; j++){
    //             if(arr[j]>arr[i]){
    //                 greater = arr[j];
    //                 break;
    //             }
    //         }
    //         al.add(greater);
    //     }
    //     return al;
    // }
}
