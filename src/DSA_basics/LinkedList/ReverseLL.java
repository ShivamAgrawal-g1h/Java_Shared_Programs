package DSA_basics.LinkedList;

import java.util.ArrayList;

class ReverseLL {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        head = revLL(head);
        printList(head);
        head = revLL_itr(head);
        printList(head);
        head = revLL_rec(head);
        printList(head);
    }
    static Node revLL(Node head){
        ArrayList<Integer> al = new ArrayList<>();
        for(Node curr = head; curr != null ; curr = curr.next){
            al.add(curr.data);
        }
        for(Node curr = head; curr != null ; curr = curr.next){
            curr.data = al.remove(al.size()-1);
        }
        return head;
    }
    static Node revLL_itr(Node head){
        Node curr = head, prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static Node revLL_rec(Node head){
        if(head == null || head.next == null) return head;
        Node rest_head = revLL_rec(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }
    static Node revLL_rec2(Node curr, Node prev){
        if(curr == null) return prev;
        Node next = curr.next;
        curr = next;
        return revLL_rec2(next,curr);
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
