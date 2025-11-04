package Java_Language.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

class al_Traversal3{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(9,1,52));
        Scanner sc = new Scanner(System.in);

        //1. pop from front (queue-like)
        int n = list.size();
        for(int i=0; i<n; i++){
            System.out.println(list.remove(0));
        }
        //⚠️ Time complexity: O(n²) (because shifting happens every time)
        //Use this only for learning, not performance.
        System.out.println(list);

        // 2. Using Iterator (safe removal)
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }

        // 3. pop from end (stack-like)
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.remove(i));
        }

        // to empty the list we can use list.clear();
    }
}
/**
        // -------- Method 1: pop from front --------
        List<Integer> list1 = new ArrayList<>(List.of(9, 1, 52));
        System.out.println("Pop from front:");
        while(!list1.isEmpty()){
            System.out.println(list1.remove(0));
        }

        // -------- Method 2: Iterator pop --------
        List<Integer> list2 = new ArrayList<>(List.of(9, 1, 52));
        System.out.println("\nIterator pop:");
        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            Integer val = it.next();
            it.remove();
            System.out.println(val);
        }

        // -------- Method 3: pop from end (stack-like) --------
        List<Integer> list3 = new ArrayList<>(List.of(9, 1, 52));
        System.out.println("\nPop from end:");
        while(!list3.isEmpty()){
            System.out.println(list3.remove(list3.size() - 1));
 */
