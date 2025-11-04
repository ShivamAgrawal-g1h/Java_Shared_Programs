package Java_Language.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Q3_CheckSorted {
    public static boolean isSorted(ArrayList<Integer> list){
        if(list.size()<2) return true;
        Boolean is_sorted = null;
        Iterator<Integer> itr = list.iterator();
        int current = itr.next();
        while(itr.hasNext()){
            int ahead = itr.next();
            if(current==ahead) continue;
            if(is_sorted==null){
                is_sorted = current>ahead;
                current = ahead;
            }
            else if(is_sorted==(current>=ahead)) current = ahead;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=0; i<n; i++){
         al.add(sc.nextInt());
     }
     System.out.println("is sorted? -> "+isSorted(al));
    }
}
