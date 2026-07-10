package Library.QueueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class DequeTraversal {
    static void main() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offerLast(20);
        Iterator<Integer> it = dq.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        for(int x : dq){
            System.out.print(x+" ");
        }
        Iterator it2 = dq.descendingIterator();
        while(it2.hasNext()){
            System.out.print(it2.next()+" ");
        }
    }
}
