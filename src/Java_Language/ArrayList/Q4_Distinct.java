package Java_Language.ArrayList;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Q4_Distinct {
    public static int countDistinct(ArrayList<Integer> list) {
        // code here
        ListIterator<Integer> i = list.listIterator();
        int dupCount = 0;
        while(i.hasNext()){
            int current = i.next();
            ListIterator<Integer> j = list.listIterator(i.nextIndex());
            while(j.hasNext()){
                if(j.next().equals(current)){
                    dupCount +=1;
                    break; // to overcome repetitive counting of duplicates
                }
                else continue;
            }
        }
        return list.size()-dupCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>(List.of(3,3,9,2,1,4,9,3,5));
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            al.add(sc.nextInt());
//        }
        System.out.println("Number of distinct integers :"+countDistinct(al));
    }
}
