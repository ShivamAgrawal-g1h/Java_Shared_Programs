package DSA_basics.LinkedList;

import java.util.HashSet;

class Q1_CheckLoop {
    // M-1 : Hashing
    public boolean detectLoop(Node head) {
        HashSet<Node> set = new HashSet<>();

        Node curr = head;

        while(true){
            if(curr.next == null) return false;

            if(set.contains(curr.next)) return true;

            else set.add(curr.next);

            curr = curr.next;
        }
    }
}
