package DSA_basics.Hashing;

import java.util.HashMap;

class Q5_ArraySubset {
    /// Wrong solution - using subset
//    public boolean isSubset(int a[], int b[]) {
//        // Your code here
//        HashSet<Integer> set = new HashSet<>();
//        for(int ele : a) set.add(ele);
//        for(int ele : b){
//            if(set.contains(ele)) continue;
//            else return false;
//        }
//        return true;
//    }
    /// For Input :
    /// 1 2 2
    /// 1 1
    /// Your Code's output is:
    /// true
    /// It's Correct output is:
    /// false
    /// Output Difference:
    /// truefalse

    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : a){
            if(map.containsKey(ele))
                map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        for(int ele : b){
            if(!map.containsKey(ele)) return false;
            else map.put(ele,map.get(ele)-1);
        }
        for(Integer value : map.values()){
            if(value<0) return false;
        }
        return true;
    }
}
