package Library.Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Q4_SortByDecreasingFreq {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        int n = arr.length;

        // Step - 1 - theta(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr)
            map.put(x, map.getOrDefault(x,0)+1 );

        // Step - 2 - theta(n)
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        // for(Map.Entry<Integer,Integer> e : map.entrySet()){
        //     list.add(e);
        // }

        // Step - 3 - O(nlogn)
        list.sort(Comparator
                .comparingInt( (Map.Entry<Integer,Integer> e) -> e.getValue() )
                .reversed()
                .thenComparing( e -> e.getKey() ));

        // Step - 4 - theta(n)
        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : list){
            int f = e.getValue();
            for(int i = 0; i<f; i++)
                al.add(e.getKey());
        }

        return al;

    }
}
