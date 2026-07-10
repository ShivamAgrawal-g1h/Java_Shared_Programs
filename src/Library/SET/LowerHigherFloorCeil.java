package Library.SET;

import java.util.TreeSet;

class LowerHigherFloorCeil {
    static void main() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(2);
        set.add(15);
        System.out.println(set.lower(5));
        System.out.println(set.higher(5));
        System.out.println(set.floor(5));
        System.out.println(set.ceiling(5));
    }
}
