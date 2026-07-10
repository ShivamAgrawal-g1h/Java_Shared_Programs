package Library.StreamsInJava;

import java.util.stream.Stream;

class Example4 {
    static void main() {
        Stream.iterate(1,x->x+1)
                .filter(x -> x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);
    }
}
