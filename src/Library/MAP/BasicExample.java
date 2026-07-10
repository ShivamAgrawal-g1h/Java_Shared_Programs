package Library.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class BasicExample {
    static void main() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("gfg",10);
        map.put("ide",15);
        map.put("courses",20);
        System.out.println(map);
        System.out.println(map.size());
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+ " " + e.getValue());
            Integer val = e.getValue();
            e.setValue(val+50);
        }
        System.out.println(map);

        System.out.println();
        System.out.println(map.remove("ide"));
        System.out.println(map.remove("practice"));

        System.out.println();
        System.out.println(map.get("gfg"));
        System.out.println(map.get("practice"));

        System.out.println((Character)null);


        System.out.println();
        LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(10,"GFG");
        map2.put(20,"IDE");
        map2.put(15,"Courses");
        map2.put(20,"Practice");
        System.out.println(map2);
        map2.remove(20);
        map2.put(20,"Practice");
        System.out.println(map2);


        System.out.println();
        LinkedHashMap<Integer,String> m = new LinkedHashMap<>(4,0.6f,true);
        m.put(10,"GFG");
        m.put(20,"IDE");
        m.put(15,"Coures");
        System.out.println(m);
        System.out.println(m.get(10));
        System.out.println(m);
        System.out.println(m.get(15));
        System.out.println(m);
        System.out.println(m.put(20,"Practice"));
        System.out.println(m);
    }
}
