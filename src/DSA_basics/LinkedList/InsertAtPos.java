package DSA_basics.LinkedList;

class InsertAtPos {
    static void main() {
        Node head = null;
        head = insertAtPos(head,1, 10);
        head = insertAtPos(head,1, 20);
        head = insertAtPos(head,2, 30);
        printList(head);
    }
    static Node insertAtPos(Node head, int pos, int data){
        Node new_node = new Node(data);
        if(pos == 1){
            new_node.next = head;
            return new_node;
        }
        Node curr = head;
        for(int i=0; i<pos-2 && curr != null; i++){
            curr = curr.next;
        }
        if(curr == null) return head;
        new_node.next = curr.next;
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
