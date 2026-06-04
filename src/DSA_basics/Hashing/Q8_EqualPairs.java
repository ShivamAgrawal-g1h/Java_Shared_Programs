package DSA_basics.Hashing;
import java.util.HashMap;
class Q8_EqualPairs {
    long equalPairs(String s) {
        // your code here
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        long pairs = 0;
        for(Character key : map.keySet()){
            pairs += map.get(key)*map.get(key);
        }
        return pairs;
    }
}
