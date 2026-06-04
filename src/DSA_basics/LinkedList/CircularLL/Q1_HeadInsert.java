package DSA_basics.LinkedList.CircularLL;

class Q1_HeadInsert {
    public static Node insertInHead(Node head, int data) {
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next != head) curr = curr.next;
        temp.next = curr.next;
        curr.next = temp;
        return temp;
    }


    public static Node insertInHead2(Node head, int data) {
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

        return head;
    }
}
