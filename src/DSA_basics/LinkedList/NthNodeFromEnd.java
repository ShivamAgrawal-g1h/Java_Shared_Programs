package DSA_basics.LinkedList;

class NthNodeFromEnd {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        System.out.println();
        System.out.println(getNthFromLast(head,3));
        System.out.println(getNthFromLast2(head,3));
    }
    static int getNthFromLast(Node head, int n) {
        if(head == null) return -1;
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        if(count<n) return -1;
        curr = head;
        for(int i=1; i<=count-n; i++){
            curr = curr.next;
        }
        return curr.data;
    }
    static int getNthFromLast2(Node head, int n) {
        Node second = head;
        for(int i=0; i<n; i++){
            if(second == null) return -1;
            second = second.next;
        }
        Node first = head;
        while(second != null){
            first = first.next;
            second = second.next;
        }
        return first.data;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
