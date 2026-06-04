package DSA_basics.LinkedList.DoublyLL;

class DeleteAtPos {
    static void main() {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = delPos(head, 2);
    }
    static Node delPos(Node head, int x) {
        if(head == null) return null;

        if(x == 1){
            Node curr = head.next;
            curr.prev = null;
            return curr;
        }

        Node curr = head;
        for(int i=1; i<=x-2; i++){
            if(curr == null) return head;
            curr = curr.next;
        }
        if(curr == null || curr.next == null) return head;
        Node ahead = curr.next.next;
        curr.next = ahead;
        if(ahead != null) ahead.prev = curr;
        return head;
    }
}
