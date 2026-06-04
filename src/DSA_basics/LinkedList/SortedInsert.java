package DSA_basics.LinkedList;

class SortedInsert {
    static void main() {
        Node head = null;
        head = sortedIns(head, 10);
        head = sortedIns(head, 5);
        head = sortedIns(head,20);
        printList(head);
    }
    static Node sortedIns(Node head, int x){
        Node new_node = new Node(x);
        if(head == null || x<head.data){
            new_node.next = head;
            return new_node;
        }
        Node curr = head;
        while(curr.next != null && curr.next.data < x){
            curr = curr.next;
        }
//        if(curr.next == null){
//            curr.next = new_node;
//            return head;
//        }
//        else{
//            new_node.next = curr.next;
//            curr.next = new_node;
//            return head;
//        }
        new_node.next = curr.next;
        curr.next = new_node;
        return head;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
