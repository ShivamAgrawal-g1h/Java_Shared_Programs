package Java_Language.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ListIterator;

class al_Traversal2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(9);
        list.add(1);
        list.add(52);

        // 1. using set method
        int ele =0;
        for(int i=0; i<list.size(); i++){
            ele = sc.nextInt();
            list.set(i,ele);
        }

        //2. Using replaceAll() (Java 8+, functional)
        list.replaceAll(x -> sc.nextInt());

        // 3. Using ListIterator (advanced, Overkill for beginners)
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            it.next();                 // move cursor
            it.set(sc.nextInt());      // replace current element
        }
    }
}
