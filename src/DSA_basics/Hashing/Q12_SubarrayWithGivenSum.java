package DSA_basics.Hashing;

import java.util.HashSet;
import java.util.Set;

class Q12_SubarrayWithGivenSum {
    static void main() {

    }
    boolean isSum(int[] arr, int sum){
        Set<Integer> set = new HashSet<>();
        int pre_sum = 0;
        for(int ele : arr){
            pre_sum += ele;
            if(set.contains(pre_sum-sum)) return true;
            if(set.contains(sum)) return true;// or if(pre_sum==sum) return true;
            set.add(pre_sum);
        }
        return false;
    }
}
