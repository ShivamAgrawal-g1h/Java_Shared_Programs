package DSA_basics.Stack;
import java.util.EmptyStackException;

class StackA{
    int[] arr;
    int cap;
    int top;
    StackA(int cap){
        top = -1;
        arr = new int[cap];
        this.cap = cap;
    }
    int pop(){
        if(top == -1) throw new EmptyStackException();
        else return arr[top--];
    }
    int peek(){
        if(top == -1) throw new EmptyStackException();
        else return arr[top];
    }
    void push(int data){
        if(top == cap-1) throw new StackOverflowError();
        arr[++top] = data;
    }
    boolean isEmpty(){
        return top == -1;
    }
    int size(){
        return top + 1;
    }
}
class ArrayImplementation{
    static void main() {
        StackA s = new StackA(5);
        s.push(10); s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
