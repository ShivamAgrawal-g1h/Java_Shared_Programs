package DSA_basics.LinkedList.DoublyLL;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int d){
        data = d;
        prev = null;
        next = null;
    }
}
class DoublyLLImplementation {
    static void main() {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
    }
}
