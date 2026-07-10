package Library.CollectionClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseMethod {
    static void main() {
        Integer[] arr = {10,20,30};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.fill(list,5);
        System.out.println(Arrays.toString(arr));
    }
}
