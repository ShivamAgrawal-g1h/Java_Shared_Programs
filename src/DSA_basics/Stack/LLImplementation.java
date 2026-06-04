package DSA_basics.Stack;

import java.util.EmptyStackException;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class StackD{
    Node head;
    int size;
    StackD(){
        size = 0;
    }
    int pop(){
        if(size == 0) throw new EmptyStackException();
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }
    int peek(){
        if( size == 0) throw new EmptyStackException();
        return head.data;
    }
    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    boolean isEmpty(){ return size == 0;}
    int size(){ return size;}
}
class LLImplementation {
    static void main() {
        StackD s = new StackD();
        s.push(10); s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
