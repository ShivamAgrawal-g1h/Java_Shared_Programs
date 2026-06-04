package DSA_basics.LinkedList;

class DeleteLastNode {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head = deleteLastNode(head);
        printList(head);
    }
    static Node deleteLastNode(Node head){
        if(head == null || head.next == null) return null;
        Node curr = head;
        while(curr.next.next != null) curr = curr.next;
        curr.next = null;
        return head;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
