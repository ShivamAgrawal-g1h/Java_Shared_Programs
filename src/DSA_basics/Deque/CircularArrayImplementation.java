package DSA_basics.Deque;

class DequeB{
    int[] arr;
    int size , cap , front;
    DequeB(int cap){
        this.cap = cap;
        arr = new int[cap];
        front = 0;
    }
    void insertFront(int x) throws Exception {
        if( isFull() ) throw new Exception("Deque Overflow");
        arr[front = (front - 1 + cap)%cap] = x;
        size++;
    }
    void insertRear(int x) throws Exception {
        if( isFull() ) throw new Exception("Deque Overflow");
        int rear = (front + size - 1)%cap;
        arr[rear = (rear + 1)%cap] = x;
        size++;
    }
    int deleteFront() throws Exception {
        if(isEmpty()) throw new Exception("Deque Underflow");
        int a = arr[front];
        front = (front+1)%cap;
        size--;
        return a;
    }
    int deleteRear() throws Exception {
        if(isEmpty()) throw new Exception("Deque Underflow");

        int rear = (front + size - 1)%cap;
        int a = arr[rear];
        size--; //rear = (rear-1+cap)%cap;
        return a;
    }
    int size(){ return size; }
    boolean isEmpty() { return size == 0; }
    boolean isFull() { return size == cap; }
    int getFront() throws Exception {
        if(isEmpty()) throw new Exception("Deque Underflow");
        return arr[front];
    }
    int getBack() throws Exception {
        if(isEmpty()) throw new Exception("Deque Underflow");
        int rear = (front + size - 1)%cap;
        return arr[rear];
    }
}
class CircularArrayImplementation {
    static void main() throws Exception {
        DequeB dq = new DequeB(10);
        dq.insertFront(25); dq.insertRear(40);
        dq.insertFront(10);
        dq.deleteFront();
        dq.deleteRear();
        System.out.println(dq.size());
        System.out.println(dq.isEmpty());
    }
}
