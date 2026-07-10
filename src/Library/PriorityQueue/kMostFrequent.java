package Library.PriorityQueue;

import java.util.*;

class kMostFrequent {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0 )+1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        while(--k >= 0){
            int max = 0;
            int maxKey = -1;
            for(int x : map.keySet()){
                if(map.get(x) > max){
                    max = map.get(x);
                    maxKey = x;
                }
                else if(map.get(x) == max){
                    maxKey = Math.min(maxKey,x);
                }
            }

            if(maxKey == -1) break;
            al.add(maxKey);
            map.remove(maxKey);
        }
        return al;
    }

    public ArrayList<Integer> topKFreq2(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0 )+1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator
                .comparing( (Map.Entry<Integer,Integer> e) -> e.getValue() )
                .reversed()
                .thenComparing(e -> e.getKey()) );
        for(int i = 0; i<k; i++){
            al.add(list.get(i).getKey());
        }
        return al;
    }

    public ArrayList<Integer> topKFreq3(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0 )+1);
        }
        ArrayList<Integer> al = new ArrayList<>();

        PriorityQueue<Map.Entry<Integer,Integer>> pq =
                new PriorityQueue<>(Comparator
                        .comparing( (Map.Entry<Integer,Integer> e) -> e.getValue() )
                        .reversed()
                        .thenComparing(e -> e.getKey()) );
        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            pq.add(x);
        }
        for(int i = 0; i<k; i++){
            al.add(pq.poll().getKey());
        }
        return al;
    }
}
