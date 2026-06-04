package DSA_basics.Queue;

import java.util.NoSuchElementException;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class QueueC{
    Node front, rear;
    int size;
    QueueC(){ front = rear = null; }
    QueueC(int data){
        front = rear = new Node(data);
    }
    void enqueue(int data){
        if( size == 0 ){
            front = rear = new Node(data);
            size++;
            return;
        }
        rear.next = new Node(data);
        rear = rear.next;
        size++;
    }
    int dequeue(){
        if( size == 0 ) throw new NoSuchElementException();
        if( size == 1 ){
            Node temp = front;
            front = rear = null;
            size--;
            return temp.data;
        }
        Node temp = front;
        front = front.next;
        size--;
        return temp.data;
    }
    int size(){ return size; }
    boolean isEmpty(){ return size == 0; }
    int getFront(){
        if( isEmpty() ) throw new NoSuchElementException();
        return front.data;
    }
    int getRear(){
        if( isEmpty() ) throw new NoSuchElementException();
        return rear.data;
    }

}


class LLImplementation {
    static void main() throws Exception {
        QueueC q = new QueueC();
        q.enqueue(10); q.enqueue(20);
        q.enqueue(30); q.enqueue(40);

        q.size();
        System.out.println(q.dequeue());
        System.out.println(q.getFront());
    }
}
