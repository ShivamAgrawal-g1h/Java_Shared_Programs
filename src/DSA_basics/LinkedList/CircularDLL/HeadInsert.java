package DSA_basics.LinkedList.CircularDLL;
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
class HeadInsert {
    static void main() {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = headInsert(head, 1);
    }
    static Node headInsert(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        head.prev.next = temp;
        temp.prev = head.prev;
        head.prev = temp;
        temp.next = head;
        return temp;
    }
}
