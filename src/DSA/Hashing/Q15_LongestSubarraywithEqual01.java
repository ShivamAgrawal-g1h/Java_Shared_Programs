package DSA.Hashing;
import java.util.HashMap;
class Q15_LongestSubarraywithEqual01 {
    // M-1 :
//    public int maxLen(int[] arr) {
//        int length=0;
//        for(int i=0; i<arr.length; i++){
//            int c0=0, c1=0;
//            for(int j=i; j<arr.length; j++){
//                if(arr[j]==0) c0++;
//                else c1++;
//                if(c0==c1) length = Math.max(length,j-i);
//            }
//        }
//        return length;
//    }
    // T.C. = O(n^2)

    public int maxLen(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) arr[i] = -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = 0;
        int pre_sum = 0;
        for(int i=0; i<arr.length; i++){
            pre_sum += arr[i];
            if(!map.containsKey(pre_sum)) map.put(pre_sum,i);
            if(pre_sum==0) length = Math.max(length,i+1);
            if(map.containsKey(pre_sum)){
                int j = map.get(pre_sum);
                length = Math.max(length,i-j);
            }
        }
        return length;
    }
}
