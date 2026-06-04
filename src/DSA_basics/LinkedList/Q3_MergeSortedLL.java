package DSA_basics.LinkedList;

class Q3_MergeSortedLL {
    Node sortedMerge(Node head1, Node head2) {
        // if (head1 == null) return head2;
        // if (head2 == null) return head1;
        // Node curr1 = head1, curr2 = head2;
        // Node tail, head_store;

        // if(curr1.data <= curr2.data){
        //     tail = new Node(curr1.data);
        //     curr1 = curr1.next;
        // }
        // else{
        //     tail = new Node(curr2.data);
        //     curr2 = curr2.next;
        // }
        // head_store = tail;

        // while(curr1 != null && curr2 != null){
        //     if(curr1.data <= curr2.data){
        //         tail.next = curr1;
        //         curr1 = curr1.next;
        //     }
        //     else{
        //         tail.next = curr2;
        //         curr2 = curr2.next;
        //     }
        //     tail = tail.next;
        // }
        // if(curr1 != null) tail.next = curr1;
        // if(curr2 != null) tail.next = curr2;

        // return head_store;


        if (head1 == null) return head2;
        if (head2 == null) return head1;
        Node curr1 = head1, curr2 = head2;
        Node dummy = new Node(0);
        Node tail = dummy;

        while(curr1 != null && curr2 != null){
            if(curr1.data <= curr2.data){
                tail.next = curr1;
                curr1 = curr1.next;
            }
            else{
                tail.next = curr2;
                curr2 = curr2.next;
            }
            tail = tail.next;
        }
        if(curr1 != null) tail.next = curr1;
        if(curr2 != null) tail.next = curr2;

        return dummy.next;
    }
}
