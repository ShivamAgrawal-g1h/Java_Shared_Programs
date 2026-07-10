package Library.MethodReferences;

import java.util.ArrayList;
import java.util.function.Supplier;

class Example4 {
    static void main() {
        Supplier<ArrayList<Integer>> s = ArrayList::new;
        ArrayList<Integer> list = s.get();
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}
