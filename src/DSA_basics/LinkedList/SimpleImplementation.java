package DSA_basics.LinkedList;
class Node{
    int data;
    Node next; // self referential structure
    Node(int x){
        data = x;
        next = null; // optional , in java is we do not initialise a memeber it is by default null
    }
}
class SimpleImplementation {
    static void main() {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        head.next.next = temp2;
    }
}
