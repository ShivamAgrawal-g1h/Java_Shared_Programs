package Library.StreamsInJava;

import java.util.Arrays;

class Example5 {
    static void main() {
        String[] arr = {"abc","cde","acd","aec","xyz"};
        Arrays.stream(arr)
                .filter(x -> x.startsWith("a"))
                .filter(x -> x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);
    }
}
