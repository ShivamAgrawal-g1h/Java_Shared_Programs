package DSA_basics.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

class StackB{
    ArrayList<Integer> al;
    int cap;
    int top;
    StackB(int cap){
        this.cap = cap;
        top = -1;
        al = new ArrayList<>(cap);
    }
    int pop(){
        if( top == -1) throw new EmptyStackException();
        return al.remove(top--);
    }
    int peek(){
        if( top == -1) throw new EmptyStackException();
        return al.get(top);
    }
    void push(int data){
        al.add(data); top++;
    }
    boolean isEmpty(){
        return top == -1;
    }
    int size(){
        return top + 1;
    }
}

class StackC {
    ArrayList<Integer> al = new ArrayList<>();

    void push(int x) {
        al.add(x);
    }
    int pop() {
        if(al.size() == 0) throw new EmptyStackException();
        //int res = al.get(al.size() - 1);
        return al.remove(al.size() - 1);
        //return res;
    }
    int peek() {
        if(al.size() == 0) throw new EmptyStackException();
        return al.get(al.size() - 1);
    }
    int size() {
        return al.size();
    }
    boolean isEmpty() {
        return al.isEmpty();
    }
}

class ArrayListImplementation {
    static void main() {
        StackC s = new StackC();
        s.push(10); s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
    }

}
