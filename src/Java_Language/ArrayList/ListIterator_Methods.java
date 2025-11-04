package Java_Language.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
class ListIterator_Methods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10,20,30));
        ListIterator<Integer> itr = list.listIterator();

        System.out.println("Initial State :");
        System.out.println("nextIndex()     -> "+itr.nextIndex());
        System.out.println("previousIndex() ->"+itr.previousIndex());
        System.out.println("hasPrevious()   ->"+itr.hasPrevious());

        itr.next();
        System.out.println("\nAfter one next :");
        System.out.println("nextIndex()     ->"+itr.nextIndex());
        System.out.println("previousIndex() ->"+itr.previousIndex());

        itr.next();
        System.out.println("\nAfter another next() :");
        System.out.println("hasNext()      ->"+itr.hasNext());
        System.out.println(list);

        itr.add(25);
        System.out.println("\nAfter add(25) :");
        System.out.println("hasPrevious()  ->"+itr.hasPrevious());
        System.out.println("hasNext()      ->"+itr.hasNext());
        System.out.println("nextIndex()    ->"+itr.nextIndex());
        System.out.println("previousIndex()->"+itr.previousIndex());
        System.out.println(list);

        itr.previous();
        System.out.println("\nAfter previous() : ");
        System.out.println("nextIndex()    ->"+itr.nextIndex());
        System.out.println("previousIndex()->"+itr.previousIndex());
        System.out.println(list);

        itr.remove();
        System.out.println("\nAfter remove() :");
        System.out.println(list);
        System.out.println("nextIndex()    ->"+itr.nextIndex());
        System.out.println("previousIndex()->"+itr.previousIndex());

        itr.add(21);
        System.out.println("\nAfter add(21) :");
        System.out.println(list);
        System.out.println("nextIndex()    ->"+itr.nextIndex());
        System.out.println("previousIndex()->"+itr.previousIndex());

        itr.next();
        itr.set(50);
        System.out.println("\nAfter a next() and then set(50) :");
        System.out.println(list);
        System.out.println("nextIndex()    ->"+itr.nextIndex());
        System.out.println("previousIndex()->"+itr.previousIndex());
    }
}