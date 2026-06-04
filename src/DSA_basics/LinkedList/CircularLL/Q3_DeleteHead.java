package DSA_basics.LinkedList.CircularLL;

class Q3_DeleteHead {

//    public static Node deleteHead(Node head) {
//        if(head == null) return null;
//        Node curr = head;
//        while(curr.next != head) curr = curr.next;
//        curr.next = head.next;
//        head.next = null;
//        return curr.next;
//    }


    public static Node deleteHead(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;

        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}
