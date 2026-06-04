package DSA_basics.Queue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x) {
        while( !q1.isEmpty() ){
            q2.add(q1.remove());
        }
        q1.add(x);
        while( !q2.isEmpty() ){
            q1.add(q2.remove());
        }
    }
    int pop() { return q1.remove(); }
    int top() { return q1.peek(); }
    boolean isEmpty() { return q1.isEmpty(); }
}

class MyStack2 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x) { q1.add(x); }
    int pop() {
        while(q1.size() > 1 ){
            q2.add(q1.remove());
        }
        int a = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return a;
    }
    int top() {
        while(q1.size() > 1 ){
            q2.add(q1.remove());
        }
        int a = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return a;
    }
    boolean isEmpty() { return q1.isEmpty(); }
}

class Q1_StackUsingQueue {
    static void main() {
        MyStack s1 = new MyStack();
        s1.push(5); s1.push(10);
        System.out.println(s1.top());
        System.out.println(s1.isEmpty());
        System.out.println(s1.pop());
        System.out.println(s1.top());
    }
}
