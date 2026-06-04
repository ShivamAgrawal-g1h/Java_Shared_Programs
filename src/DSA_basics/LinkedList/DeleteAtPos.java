package DSA_basics.LinkedList;

class DeleteAtPos {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head = deleteAtPos(head, 2);
        printList(head);
    }
    static Node deleteAtPos(Node head, int pos) {
        if(head == null) return null;
        if(pos == 1) return head.next;
        Node curr = head;
        for(int i=0; i<pos-2; i++){
            if(curr == null) return head;
            curr = curr.next;
        }
        if(curr!= null && curr.next != null)curr.next = curr.next.next;
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
