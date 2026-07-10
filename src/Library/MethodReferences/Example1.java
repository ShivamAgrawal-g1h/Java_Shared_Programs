package Library.MethodReferences;

import java.util.Arrays;
import java.util.List;

class Example1 {
    static void main() {
        List<Integer> al = Arrays.asList(10,20,15,16);
        al.forEach(x -> System.out.println(x));
        al.forEach(System.out::println);
    }
}
