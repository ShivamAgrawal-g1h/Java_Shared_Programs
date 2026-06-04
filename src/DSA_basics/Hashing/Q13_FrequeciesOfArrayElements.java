package DSA_basics.Hashing;
import java.util.HashMap;
class Q13_FrequeciesOfArrayElements {
    static void main() {

    }
    void printFreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr)
            map.put(ele,map.getOrDefault(ele,0)+1);
        //map.put(ele, map.get(ele) == null ? 1 : mp.get(ele)+1 );

        //to print elements in same order as they appear in input
        for(int ele : arr){
            System.out.println(ele+" "+map.get(ele));
            map.remove(ele);
        }
    }
}