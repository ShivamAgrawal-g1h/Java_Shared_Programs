package Library.MAP;

import java.util.Map;
import java.util.TreeMap;

class TreeMapExample {
    static void main() {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"geeks");
        map.put(15,"ide");
        map.put(5,"courses");
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(map.size());
        System.out.println(map.remove(10));

        System.out.println();
        map.put(10,"geeks");
        System.out.println(map);
        System.out.println(map.higherKey(10));
        System.out.println(map.lowerKey(10));
        System.out.println(map.floorKey(10));
        System.out.println(map.ceilingKey(10));


        System.out.println();
        System.out.println(map.higherEntry(10));
        System.out.println(map.higherEntry(10).getKey());
        System.out.println(map.higherEntry(10).getValue());
        System.out.println(map.lowerEntry(10));
        System.out.println(map.floorEntry(10));
        System.out.println(map.ceilingEntry(10));


    }
}
