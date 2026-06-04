package DSA_basics.LinkedList.CircularLL;

class Q2_TailInsert {
    public static Node tailInsert(Node head, int data) {
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next != head) curr = curr.next;
        temp.next = head;
        curr.next = temp;
        return head;
    }

    public static Node insertInTail(Node head, int data) {
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;

        int a = head.data;
        head.data = temp.data;
        temp.data = a;

        return head.next;
    }
}
