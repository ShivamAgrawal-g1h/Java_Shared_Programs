package DSA_basics.Hashing;
import java.util.HashMap;
import java.util.Map;

class Maps {
    static void main() {
        HashMap<String,Integer> map = new HashMap<>(new HashMap<>());
        map.put("Raghav",25); map.put("Aditya",19);
        map.put("Vivek",17); map.put("Rohan",20);
        System.out.println(map+" "+map.size());
        System.out.println(map.remove("Vivek"));
        System.out.println(map+" "+map.size());

        System.out.println();
        System.out.println(map.remove(19));
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Raghav"));
        System.out.println(map.remove("Rohan"));

        System.out.println();
        map.put("Aditya",20);
        System.out.println(map+" "+map.size());
        System.out.println(map.containsKey("Vivek"));
        System.out.println(map.containsValue(20));

        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        for(Integer value : map.values()){
            System.out.println(value);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
        map.forEach((key, value) -> {
            int x = 37;
            x = value + x;
            System.out.println(x);
            System.out.println(key + " " + value);
        });

        System.out.println();
        map.put(null,1);
        map.put("1",null);
        System.out.println(map.get(null)+" "+map.get("1")); // Hash table based implementation of the Map interface.
        //This implementation provides all of the optional map operations, and permits null values and the null key
        // (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.)
        // This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time.
    }
}
