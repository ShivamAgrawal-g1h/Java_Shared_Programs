package DSA_basics.LinkedList;

class InsertionAtBegin {
    static void main() {
        Node head = null;
        head = insertAtBegin(head,30);
        head = insertAtBegin(head,20);
        head = insertAtBegin(head,10);
        printList(head);
    }
    static Node insertAtBegin(Node head, int x){
        // head -- old first element
        Node new_head = new Node(x);
        new_head.next = head;
        return new_head;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
