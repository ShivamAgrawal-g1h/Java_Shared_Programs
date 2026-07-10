package Library.ArrayListAndLinkedList;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

class usingSetOfListIterator {
    static void main() {
        List<Integer> list = Arrays.asList(10,20,30);
        ListIterator<Integer> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            int x = it.previous();
            it.set(x*2);
        }
        System.out.println(list);
    }
}
