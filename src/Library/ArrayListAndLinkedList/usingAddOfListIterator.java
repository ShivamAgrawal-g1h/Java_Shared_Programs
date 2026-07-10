package Library.ArrayListAndLinkedList;

import java.util.*;

class usingAddOfListIterator {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            it.add(5);
            it.next();
        }
        System.out.println(list);

        // infinite loop
//        ListIterator<Integer> it = list.listIterator(list.size());
//        while(it.hasPrevious()){
//            it.add(5);
//            it.previous();
//        }
//        System.out.println(list);
    }

}
