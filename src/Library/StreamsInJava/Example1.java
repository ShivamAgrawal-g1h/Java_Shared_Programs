package Library.StreamsInJava;

import java.util.Arrays;

class Example1 {
    static void main() {
        int[] arr = { 30, 20, 10};
        int sum = Arrays.stream(arr)
                        .sum();
        System.out.println(sum);
    }
}
