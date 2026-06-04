package DSA_basics.LinkedList;

class MiddleOfLL {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        System.out.println();
        middle(head);
        middle2(head);
    }
    static void middle(Node head){
        if(head == null) return;
        int count = 0;
        Node curr = head;
        for(curr = head; curr != null ; curr = curr.next){
            count++;
        }
        curr = head;
        for(int i=1; i<=count/2; i++){
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    static void middle2(Node head){
        if(head == null) return;
        Node slow = head , fast = head;
        while(fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

    }
    static void middle3(Node head){
        int count = 0;
        Node mid = head;
        while(head != null){
            if(count%2 == 1) { // Update mid, when 'count' is odd number
                mid = mid.next;
            }
            count++;
            head = head.next;
        }
        if (mid != null)
            System.out.println(mid.data);
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
