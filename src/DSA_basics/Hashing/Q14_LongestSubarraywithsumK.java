package DSA_basics.Hashing;
import java.util.HashMap;
class Q14_LongestSubarraywithsumK {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int length=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int pre_sum = 0;
        for(int i=0; i<arr.length; i++) {
            pre_sum += arr[i];
            if(!map.containsKey(pre_sum)) map.put(pre_sum, i);
            if(pre_sum==k){
                length = Math.max(length,i+1);
            }
            if(map.containsKey(pre_sum-k)){
                int j = map.get(pre_sum-k);
                length = Math.max(length,i-j);
            }
        }
        return length;
    }
    //
    //Time Complexity: theta(n).
    //Auxiliary Space: O(n).
}
