package Library.Collection;

import java.util.*;

class IteratingThroughCollection {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,15,20,25));
        System.out.println("Iterator : ");
        System.out.println("List : "+ list);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer num = it.next();
            if(num%2 == 0) it.remove();
        }
        System.out.println("List after processing : "+ list);
        System.out.println();

        System.out.println("ListIterator :");
        list = new ArrayList<>(Arrays.asList(10,15,20,25));
        ListIterator<Integer> it2 = list.listIterator();
        System.out.println("List : "+ list);
        while(it2.hasNext()){
            int x = it2.next();
            System.out.print(x+" ");
            if(x%20==0) it2.remove();
        }
        while(it2.hasPrevious()){
            System.out.print(it2.previous()+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("For each loop : ");
        list = new ArrayList<>(Arrays.asList(10,15,20,25));
        for(int x : list){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("For each method : ");
        list = new ArrayList<>(Arrays.asList(10,15,20,25));
        list.forEach(x-> System.out.print(x+" "));
    }
}
