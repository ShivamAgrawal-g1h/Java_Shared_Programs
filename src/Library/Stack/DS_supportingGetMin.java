package Library.Stack;

import java.util.ArrayDeque;

// M - Using two stacks
//class SpecialStack{
//    ArrayDeque<Integer> st;
//    ArrayDeque<Integer> minStack;
//    public SpecialStack(){
//        st = new ArrayDeque<>();
//        minStack = new ArrayDeque<>();
//    }
//    void push(int x){
//        st.push(x);
//        if(minStack.isEmpty() || x <= minStack.peek())
//            minStack.push(x);
//    }
//    void pop(){
//        if(st.isEmpty()) return;
//        int x = st.pop();
//        if(minStack.peek() == x) minStack.pop();
//    }
//    int peek(){
//        if(st.isEmpty()) return -1;
//        return st.peek();
//    }
//    int getMin(){
//        if(minStack.isEmpty()) return -1;
//        return minStack.peek();
//    }
//}


// M - O(1) T.C. and O(1) A.S.
class SpecialStack{
    ArrayDeque<Integer> st;
    int currMin;
    public SpecialStack(){
        st = new ArrayDeque<>();
    }
    void push(int x){
        if(st.isEmpty()){
            st.push(x);
            currMin = x;
        }
        else if(x > currMin){
            st.push(x);
        }
        else{
            st.push(2*x - currMin);
            currMin = x;
        }
    }
    void pop(){
        if(st.isEmpty()) return;
        else if(st.peek() < currMin){
            int encryptedValue = st.pop();
            currMin = 2*currMin - encryptedValue;
        }
        else st.pop();
    }
    int peek(){
        if(st.isEmpty()) return -1;
        else if(st.peek() < currMin) return currMin;
        else return st.peek();
    }
    int getMin(){
        if(st.isEmpty()) return -1;
        else return currMin;
    }
}
