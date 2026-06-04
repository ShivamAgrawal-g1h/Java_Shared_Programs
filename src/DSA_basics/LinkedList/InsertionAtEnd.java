package DSA_basics.LinkedList;

class InsertionAtEnd {
    static void main() {
        Node head = null;
        head = insertAtEnd(head,10);
        head = insertAtEnd(head,20);
        head = insertAtEnd(head,30);
        printList(head);
    }
    static Node insertAtEnd(Node head, int x){
        Node new_node = new Node(x);
        if(head == null) return new_node;
        Node curr = head;
        while(curr.next != null) curr = curr.next;
        curr.next = new_node;
        return head;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
