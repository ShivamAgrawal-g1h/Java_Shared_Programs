package Library.StreamsInJava;

import java.util.*;

class Creating {
    static void main() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.stream()
                .filter(x -> x>10)
                .filter(x -> x%5 == 0)
                .forEach(System.out::println);

        List<Integer> l = new ArrayList<>(Arrays.asList(5,10,20,30,8,7));
        l.stream()
                .filter(x -> x%2 == 0)
                .filter(x -> x>10)
                .forEach(System.out::println);
        l.parallelStream()
                .filter(x -> x%2 == 0)
                .filter(x -> x>10)
                .forEach(System.out::println);
    }
}
