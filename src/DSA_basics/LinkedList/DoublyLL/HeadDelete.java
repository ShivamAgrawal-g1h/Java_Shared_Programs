package DSA_basics.LinkedList.DoublyLL;

class HeadDelete {
    static void main() {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = deleteHead(head);
    }
    static Node deleteHead(Node head) {
        if(head == null || head.next == null) return null;
        Node curr = head.next;
        curr.prev = null;
        return curr;
    }
}
