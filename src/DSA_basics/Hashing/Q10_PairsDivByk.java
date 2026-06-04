package DSA_basics.Hashing;

import java.util.HashMap;

//Given an array arr[] and positive integer k, the task is to count total number of pairs in the array whose sum is divisible by k.
//
//Example:
//Input :  arr[] = {2, 2, 1, 7, 5, 3}, k = 4
//Output : 5
//Explanation : There are five pairs possible whose sum is divisible by '4' i.e., (2, 2), (1, 7), (7, 5), (1, 3) and (5, 3)
class Q10_PairsDivByk {
    public static long countKdivPairs(int arr[], int n, int k) {
        // code here
        long pairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele%k,map.getOrDefault(ele%k,0)+1);
        }
        for(Integer key : map.keySet()){
            // (a,b) : (a+b)div by k -> (a+b)%k = 0
            // -> a%k = -b%k or a%k = k-b%k i.e.
            // a = b = 0 or rem = k - ele
            int rem = (k-key);
            if(map.containsKey(rem)){
                if(k%2==0 && rem==k/2){
                    int freq = map.get(rem);
                    pairs += freq*(freq-1)/2;
                }
                else if(key<rem)
                    pairs += map.get(key)*map.get(rem);
            }
            if(key==0){ // here rem will be 'k' so we cant so rem==0
                int freq = map.get(0);
                pairs += freq*(freq-1)/2;
            }
        }
        return pairs;
    }
}
