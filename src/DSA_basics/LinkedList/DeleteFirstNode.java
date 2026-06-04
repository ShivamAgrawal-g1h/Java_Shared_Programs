package DSA_basics.LinkedList;

class DeleteFirstNode {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        printList(head);
        head = deleteFirstNode(head);
        printList(head);
    }
    static Node deleteFirstNode(Node head){
        if(head == null) return null;
        return head.next;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
