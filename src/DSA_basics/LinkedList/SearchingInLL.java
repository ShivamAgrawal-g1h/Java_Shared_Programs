package DSA_basics.LinkedList;

class SearchingInLL {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        searchLL(head,20);
    }
    static int searchLL(Node head, int x){
        int pos = 1;
        while(head != null){
            if(head.data == x) return pos;
            head = head.next;
            pos++;
        }
        return -1;
    }
    static int searchLL2(Node head, int x){
        if(head == null) return -1;
        if(head.data == x) return 1;
        else{
            int pos = searchLL2(head.next, x);
            if(pos == -1) return -1;
            else return pos+1;
        }
    }
}
