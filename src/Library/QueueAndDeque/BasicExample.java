package Library.QueueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class BasicExample {
    static void main() {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10); q.offer(20); q.offer(30);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());


        System.out.println();


        Deque<Integer> d = new ArrayDeque<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.pollFirst();
        d.pollLast();
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}
