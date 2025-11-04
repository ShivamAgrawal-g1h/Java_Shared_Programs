package Java_Language.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class al_Insertion {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to insert : ");
        int n = sc.nextInt();

        // using add method
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.add(ele);
        }

        //set() → works only on existing size
        //Iterator → traversal, not insertion
        /** if we try using iterator
         list.ensureCapacity(90);
         Iterator itr = list.iterator();
         int ele,i = 0;
         while(itr.hasNext()){
         ele = sc.nextInt();
         list.set(i,ele);
         i++;
         System.out.println(list);
         }
         it won't work as desired
         */
    }
}
