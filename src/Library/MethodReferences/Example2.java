package Library.MethodReferences;

import java.util.Arrays;
import java.util.List;

class Example2 {
    static void main() {
        List<Integer> al = Arrays.asList(10,20,7,8);
        al.forEach(x -> Example2.Square(x));
        System.out.println();

        al.forEach(Example2::Square);
        System.out.println();
    }
    static void Square(Integer x){
        System.out.println(x*x);
    }
}
