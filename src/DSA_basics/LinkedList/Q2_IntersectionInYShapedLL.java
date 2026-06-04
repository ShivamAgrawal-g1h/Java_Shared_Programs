package DSA_basics.LinkedList;

import java.util.HashSet;

class Q2_IntersectionInYShapedLL {
    public Node intersectPoint(Node head1, Node head2) {
        HashSet<Node> set = new HashSet<>();

        Node curr1 = head1, curr2 = head2;

        while(curr1 != null){
            set.add(curr1);
            curr1 = curr1.next;
        }

        while(curr2 != null){
            if(set.contains(curr2)) return curr2;
            set.add(curr2);
            curr2 = curr2.next;
        }

        return null;
    }
}
