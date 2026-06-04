package DSA_basics.Deque;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }
}
class DequeA{
    Node front, rear;
    int size;
    DequeA(){ front = rear = null; }
    void insertFront(int x){
        if( size == 0 ){
            front = rear = new Node(x);
            size++;
            return;
        }
        Node temp = new Node(x);
        temp.next = front;
        front.prev = temp;
        front = temp;
        size++;
    }
    void insertRear(int x){
        if( size == 0 ){
            front = rear = new Node(x);
            size++;
            return;
        }
        Node temp = new Node(x);
        rear.next = temp;
        temp.prev = rear;
        rear = rear.next;
        size++;
    }
    int deleteFront() throws Exception {
        if( size == 0 ) throw new Exception("Deque Underflow");
        int a = front.data;
        if( size == 1 ){
            front = rear = null;
        }
        else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return a;
    }
    int deleteRear() throws Exception {
        if (size == 0) throw new Exception("Deque Underflow");
        int a = rear.data;
        if( size == 1 ){
            front = rear = null;
        }
        else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return a;
    }
    int size(){ return size; }
    boolean isEmpty() { return size == 0; }
    int getFront() throws Exception {
        if (size == 0) throw new Exception("Deque Underflow");
        return front.data;
    }
    int getRear() throws Exception {
        if (size == 0) throw new Exception("Deque Underflow");
        return rear.data;
    }
}

/*
A failed try to implement Deque using singly LL
class DequeB{
    Node front, beforeRear;
    int size;
    Node dummyNode = new Node(0);
    DequeB(){ front = beforeRear = null; }
    void insertFront(int x){
        if(size == 0){
            beforeRear = new Node(0); // dummy node
            beforeRear.next = front = new Node(x);
        }
        else if( size == 1){
            beforeRear = front;
            beforeRear.next = front = new Node(x);
        }
        else{
            Node temp = new Node(x);
            temp.next = front;
            front = temp;
        }
        size++;
    }
    void insertRear(int x){
        if(size == 0){
            beforeRear = new Node(0); // dummy node
            beforeRear.next = front = new Node(x);
        }
        else if( size == 1){
            beforeRear = front;
            beforeRear.next = front.next = new Node(x);
        }
        else{
            Node temp = new Node(x);
            beforeRear.next.next = temp;
            beforeRear = beforeRear.next;
        }
        size++;
    }
    int deleteFront() throws Exception {
        if(size == 0) throw new Exception("Deque Underflow");
        else if(size == 1){
            int a = front.data;
            beforeRear = front = null;
            size--;
            return a;
        }
        else{
            int a = front.data;
            front = front.next;
            // let previous front act as dummy beforeRear

            size--;
            return a;
        }
    }
    int deleteRear() throws Exception {
        if (size == 0) throw new Exception("Deque Underflow");
        else if (size == 1) {
            int a = front.data;
            beforeRear = front = null;
            size--;
            return a;
        }
        else if( size == 2){
            front.next = null;
            beforeRear = beforeRear.next; // let rear act as dummy node
            beforeRear.next = front;
            size--;
            return beforeRear.data;
        }
        else{
            int a = beforeRear.next.data;
            beforeRear.next = null;
            Node newRear = beforeRear;
            beforeRear = dummyNode;
            beforeRear.next = newRear;
            size--;
            return a;
        }
    }
}
 */

class LLImplementation {
    static void main() throws Exception {
        DequeA dq = new DequeA();
        dq.insertFront(25); dq.insertRear(40);
        dq.insertFront(10);
        dq.deleteFront();
        dq.deleteRear();
        System.out.println(dq.size());
        System.out.println(dq.isEmpty());
    }
}
