package Library.Collection;

import java.util.*;

class ToArrMethods {
    static void main() {
        //Queue<Integer> q = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);

        // EXAMPLE - 1
        Object[] arr = list.toArray();

        for(Object x : arr)
            System.out.print(x+" ");
        System.out.println();

        // EXAMPLE - 2 : PROBLEM
        // Integer[] arr2 = list.toArray(); gives compiler error


        // EXAMPLE - 3 : SOLUTION
        Integer[] arr3 = new Integer[list.size()];
        arr3 = list.toArray(arr3);
        for(Integer x : arr3){
            System.out.print(x+" ");
        }
    }
    //Note: The order of insertion might vary depending on the collection type. For example:
    //
    //TreeSet stores elements in sorted order.
    //HashSet stores elements in a random order.
    //PriorityQueue follows a min-heap array representation.
}
