package Library.MAP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

class Q_GreaterElement {
    public ArrayList<Integer> greater(int[] arr){
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int x : arr)
            map.put(x, map.getOrDefault(x, 0)+1);
        int cumFreq = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            Integer temp = e.getValue();
            map.put(e.getKey(),cumFreq);
            cumFreq += temp;
        }
        for(int i = 0; i<n; i++){
            al.add(map.get(arr[i]));
        }
        return al;
    }
}
