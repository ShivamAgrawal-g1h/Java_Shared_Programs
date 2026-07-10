package Library.StreamsInJava;

import java.util.Arrays;

class Example2 {
    static void main() {
        int[] arr = {};
        int max = Arrays.stream(arr)
                        .max()
                        .getAsInt();
        System.out.println(max);
    }
}
