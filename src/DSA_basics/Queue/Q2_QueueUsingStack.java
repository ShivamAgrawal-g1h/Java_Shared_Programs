package DSA_basics.Queue;

import java.util.Stack;

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int x) {
        while( !s1.isEmpty() ){
            s2.push(s1.pop());
        }
        s1.push(x);
        while( !s2.isEmpty() ){
            s1.push(s2.pop());
        }
    }
    int pop() { return s1.pop(); }
    int peek() { return s1.peek(); }
    boolean isEmpty() { return s1.isEmpty(); }
}

class Q2_QueueUsingStack {
    static void main() {
        MyQueue q = new MyQueue();
        q.push(5); q.push(10);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.isEmpty());
    }
}
