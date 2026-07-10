package Library.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Example {
    static void removeEven(Collection<Integer> c){
        Iterator<Integer> it = c.iterator();
        while(it.hasNext()){
            int x = it.next();
            if(x%2 == 0)
                it.remove();
        }
    }
    static void removeByCond(Collection<?> c){
        Iterator<?> it = c.iterator();
        while(it.hasNext()){
            if(cond(it.next()) == true)
                it.remove();
        }
    }
    static boolean cond(Object x){
        // apply the condition
        return true;
    }

    static void main() {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(15);
        c.add(20);
        removeEven(c);
    }
}
