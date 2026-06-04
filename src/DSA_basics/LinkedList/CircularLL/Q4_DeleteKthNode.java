package DSA_basics.LinkedList.CircularLL;

class Q4_DeleteKthNode {
    public static Node deleteAtPosition(Node head, int k) {
        Node r = head;

        if(k == 1){
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

        for(int i=1; i<k-1; i++){
            r = r.next;
        }

        r.next = r.next.next;

        return head;
    }
}
