package DSA.Hashing;

import java.util.ArrayList;
import java.util.HashSet;

class Q3_MissingElemenstInRange {
    static void main() {

    }
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] a = new int[high-low+1];
        for(int ele : arr){
            if(ele>=low && ele<=high) a[ele-low] = 1;
        }
        for(int i=low; i<=high; i++){
            if(a[i-low]==0) ans.add(i);
        }
        return ans;
    }

//    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//        for(int ele : arr) set.add(ele);
//        for(int i=low; i<=high; i++){
//            if(!set.contains(i)) ans.add(i);
//        }
//        return ans;
//    }
}
