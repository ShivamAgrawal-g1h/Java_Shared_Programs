package Library.SET;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class BasicExample {
    static void main() {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set.remove(10);
        set2.add(10);
        System.out.println(set2);


        TreeSet<String> set3 = new TreeSet<>();
        set3.add("gfg");
        set3.add("courses");
        set3.add("ide");
        System.out.println(set3);
        System.out.println(set3.contains("ide"));
        Iterator<String> it = set3.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
    }
}
