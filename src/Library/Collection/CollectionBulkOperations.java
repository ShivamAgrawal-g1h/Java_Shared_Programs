package Library.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class CollectionBulkOperations {
    static void main() {
        // addAll
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        System.out.println("List1 : "+list1);
        System.out.println("List2 : "+list2);
        System.out.println();
        System.out.println("Working of addAll : ");
        System.out.println("(addAll items from list2 into list1) "+list1.addAll(list2));
        System.out.println("List1 : "+list1);
        System.out.println("Adding 40 and 50 into list2.");
        list2.add(40);
        list2.add(50);
        System.out.println("List2 : "+list2);
        System.out.println("(Re addAll list2 into list1.)"+list1.addAll(list2));
        System.out.println("List1 : "+list1);
        System.out.println();


        HashSet<Integer> set = new HashSet<>();
        set.add(10); set.add(20); set.add(30);
        System.out.println("Working of addAll with HashSet.");
        System.out.println("Set : "+set);
        System.out.println("(addAll items of list2 into set) "+set.addAll(list2));
        System.out.println("Set : "+set);

        System.out.println("(Re addAll items of list2 into set)"+set.addAll(list2));
        System.out.println("Set : "+set);
        System.out.println();


        // removeAll
        System.out.println("Working of removeAll : ");
        list1 = new ArrayList<>();
        list1.add(10); list1.add(20); list1.add(30);
        list2 = new ArrayList<>();
        list2.add(10); list2.add(20);
        System.out.println("List1 : "+list1);
        System.out.println("List2 : "+list2);
        System.out.println("(Remove all items of list2 from list1) "+list1.removeAll(list2));
        System.out.println("List1 : "+list1);
        System.out.println();


        // retainAll
        System.out.println("Working of retainAll : ");
        list1 = new ArrayList<>();
        list1.add(10); list1.add(20); list1.add(30);
        list2 = new ArrayList<>();
        list2.add(10); list2.add(20);
        System.out.println("List1 : "+list1);
        System.out.println("List2 : "+list2);
        System.out.println("(Retain all items of list2 in list1) "+list1.retainAll(list2));
        System.out.println("List1 : "+list1);
        System.out.println();


        // removeIf
        System.out.println("Working of removeIf : ");
        list1 = new ArrayList<>();
        list1.add(10); list1.add(15); list1.add(30); list1.add(19);
        System.out.println("List1 : "+list1);
        System.out.println("Remove even items : list1.removeIf((n) -> (n%2 == 0));");
        list1.removeIf((n) -> (n%2 == 0));
        System.out.println("List1 : "+list1);
    }
}
