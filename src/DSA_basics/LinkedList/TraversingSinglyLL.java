package DSA_basics.LinkedList;
class TraversingSinglyLL {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        printList(head);
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    static void printList2(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        printList2(head.next);
    }
}
