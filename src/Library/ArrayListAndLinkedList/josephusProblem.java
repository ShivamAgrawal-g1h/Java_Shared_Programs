package Library.ArrayListAndLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

class josephusProblem {
    int josephus(int n, int k){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i<n; i++){
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        while(list.size() > 1){
            int count = 0;
            while(count < k){
                if(!it.hasNext())
                    it = list.iterator();

                it.next();
                count++;
            }
            it.remove();
        }
        return list.getFirst();
    }
}
