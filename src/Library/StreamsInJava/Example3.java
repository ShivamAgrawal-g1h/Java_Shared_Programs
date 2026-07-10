package Library.StreamsInJava;

import java.util.Arrays;

class Example3 {
    static void main() {
        int[] arr = { 30, 20, 10};
        double avg = Arrays.stream(arr)
                        .average()
                        .getAsDouble();
        System.out.println(avg);
    }
}
