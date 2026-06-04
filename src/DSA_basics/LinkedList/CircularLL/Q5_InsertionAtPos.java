package DSA_basics.LinkedList.CircularLL;

class Q5_InsertionAtPos {
    public static void insertAtPosition(Node head, int pos, int data) {
        Node temp = new Node(data);
        if(head == null){
            // temp.next = temp;
            // return temp;
            return;
        }
        int l = 1;
        Node r = head;
        while(r.next != head){
            r = r.next;
            l++;
        }
        r = r.next;

        if(pos > l) return;
        for(int i=1; i<=pos-1; i++){
            r = r.next;
        }
        temp.next = r.next;
        r.next = temp;
        return;
    }
}
