package Library.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class q3_SortAccToAnotherArray {
    static void relativeSort(int[] a1, int[] a2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<a2.length; i++){
            if(!map.containsKey(a2[i]))
                map.put(a2[i],i);
        }

        ArrayList<Integer> al = new ArrayList<>();
        for(int x : a1) al.add(x);

        al.sort(Comparator
                .comparing((Integer x) -> map.getOrDefault(x,Integer.MAX_VALUE) )
                .thenComparing(x -> x) );

        for(int i = 0; i<a1.length; i++) a1[i] = al.get(i);
    }

    static void relativeSort2(int[] a1, int[] a2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : a1)
            map.put(x, map.getOrDefault(x,0)+1);
        int idx = 0;
        // process elements present in a2
        for(int x : a2){
            int cnt = map.getOrDefault(x,0);
            while(cnt-- > 0){
                a1[idx++] = x;
            }
            map.remove(x);
        }
        // remaining elements
        ArrayList<Integer> rem = new ArrayList<>();
        for(int key : map.keySet()){
            int val = map.get(key);
            while(val-- > 0){
                rem.add(key);
            }
        }
        Collections.sort(rem);
        for(int x : rem)
            a1[idx++] = x;

    }
}
