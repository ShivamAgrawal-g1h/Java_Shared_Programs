package DSA.Hashing;

import java.util.HashSet;

class Q11_0sumSubArray {
    static void main() {

    }
    boolean is0Subarray(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int pre_sum = 0;
        for(int ele : arr){
             pre_sum += ele;
            if(set.contains(pre_sum)) return true;
            if(set.contains(0)) return true;
            set.add(pre_sum);
        }
        return false;
    }
}
