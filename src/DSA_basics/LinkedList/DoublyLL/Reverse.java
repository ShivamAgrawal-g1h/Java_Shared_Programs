package DSA_basics.LinkedList.DoublyLL;

class Reverse {
    static void main() {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = reverse(head);
    }
    static Node reverse(Node head) {
        if(head == null) return null;

        Node curr = head.next;
        Node prev = head;
        while(curr != null){
            Node next = curr.next;

            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head.prev = head.next;
        head.next = null;
        return prev;
    }

    static Node reverse2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null, curr = head;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }
}
