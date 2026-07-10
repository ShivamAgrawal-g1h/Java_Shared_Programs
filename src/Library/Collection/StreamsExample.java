package Library.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StreamsExample {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,15,7,20,40));
        list.stream()
                .forEach(x -> System.out.print(x+" "));
        System.out.println();
        list.stream()
                .filter(x -> x>10)
                .filter(x -> x%2 == 0)
                .forEach(x -> System.out.print(x+" "));
    }
}
