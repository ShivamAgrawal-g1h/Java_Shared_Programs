package Java_Language.Advanced;

import java.util.Arrays;
import java.util.List;

class MethodRef1 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,15,16); // makes an array as a list of integer objects i.e. ArrayList
        al.forEach(x -> System.out.println(x));
        al.forEach(System.out::println);// eliminates the need for explicit parameter handling
        //it's a method reference to println method of System class, out Stream
    }
}
