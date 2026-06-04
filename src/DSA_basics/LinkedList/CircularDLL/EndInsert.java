package DSA_basics.LinkedList.CircularDLL;

class EndInsert {
    static void main() {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = endPut(head,40);
    }
    static Node endPut(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        return head;
    }
}
