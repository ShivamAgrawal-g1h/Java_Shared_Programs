package DSA_basics.LinkedList.CircularLL;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
class Traversal {
    void printList(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        for(Node r = head.next; r != head ; r = r.next){
            System.out.println(r.data+" ");
        }
    }

    void printList2(Node head){
        if(head == null) return;
        Node r = head;
        do{
            System.out.print(r.data);
            r = r.next;
        } while(r != head);
    }
}
