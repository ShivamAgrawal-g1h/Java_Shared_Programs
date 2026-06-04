package DSA_basics.Queue;

import java.util.NoSuchElementException;

class QueueA{
    // front idx is always 0 and rear always size-1 in this implementation
    int[] arr;
    int size;
    int cap;
    QueueA(int cap) {
        arr = new int[cap];
        this.cap = cap;
    }

    void enqueue(int data) throws Exception {
        if( size == cap ) throw new Exception("Queue Overflow");
        int rearIdx = (size - 1);
        arr[++rearIdx] = data;
        size++;
    }

    int dequeue(){
        if( size == 0 ) throw new NoSuchElementException();
        int temp = arr[0];
        for(int i=0; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return temp;
    }
    int size(){ return size; }
    int getFront(){
        if( size == 0 ) throw new NoSuchElementException();
        return arr[0];
    }
    int getBack(){
        if( size == 0 ) throw new NoSuchElementException();
        int rear = (size - 1);
        return arr[rear];
    }
    boolean isEmpty(){ return size == 0; }
    boolean isFull(){ return size == cap; }
}

class QueueB{
    // Based on circular arrays
    int[] arr;
    int size,cap;
    int front;
    QueueB(int cap) {
        arr = new int[cap];
        this.cap = cap;
    }

    void enqueue(int data) throws Exception {
        if( size == cap ) throw new Exception("Queue Overflow");
        int rear = (front + size - 1)%cap;
        rear = (rear+1) % cap;
        arr[rear] = data;
        size++;
    }

    int dequeue(){
        if( size == 0 ) throw new NoSuchElementException();
        int temp = arr[front];
        front = (front+1)%cap;
        size--;
        return temp;
    }
    int size(){ return size; }
    int getFront(){
        if( size == 0 ) throw new NoSuchElementException();
        return arr[front];
    }
    int getRear(){
        if( size == 0 ) throw new NoSuchElementException();
        int rear = (front + size - 1)%cap;
        return arr[rear];
    }
    boolean isEmpty(){ return size == 0; }
    boolean isFull(){ return size == cap; }
}

class ArrayImplementation {
    static void main() throws Exception {
        QueueA q = new QueueA(10);
        q.enqueue(10); q.enqueue(20);
        q.enqueue(30); q.enqueue(40);

        q.size();
        System.out.println(q.dequeue());
        System.out.println(q.getFront());
    }
}
