package Java_Language.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
class Q2_OddEven {
    public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> list){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Iterator<Integer> itr = list.iterator();
        ArrayList<Integer> odd  = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        while(itr.hasNext()){
            int x = itr.next();
            if(x%2==0){
                even.add(x);
            }
            else{
                odd.add(x);
            }
        }
        al.add(even);
        al.add(odd);
        return al;
    }
    public static void main(String[] args) {
     ArrayList<Integer> arr = new ArrayList<>(List.of(12,1,83,99,26));
     ArrayList<ArrayList<Integer>> ans = evenOdd(arr);
     System.out.println(ans);
    }
}