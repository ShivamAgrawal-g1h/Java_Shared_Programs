package DSA_basics.Hashing;

import java.util.HashMap;
import java.util.Map;

class Q7_PairsWithDiff {
    int countPairs(int[] arr, int k) {
        // code here
        int pairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
//            if(!map.containsKey(ele)) map.put(ele,1);
//            else map.put(ele,map.get(ele)+1);
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            int rem1 = key-k;
            if(map.containsKey(rem1)) pairs += value*map.get(rem1);
            int rem2 = key+k;
            if(map.containsKey(rem2)) pairs += value*map.get(rem2);
        }
        return pairs;
    }
}
