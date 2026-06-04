package DSA_basics.Hashing;
import java.util.HashSet;
class Q1_Distinct_Elements {
    static int distinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        return set.size();
    }
}
