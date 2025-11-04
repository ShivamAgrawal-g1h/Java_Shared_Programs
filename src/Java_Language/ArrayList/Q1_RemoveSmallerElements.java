package Java_Language.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
class Q1_RemoveSmallerElements {
    public static void main (String[] args) {
        List<Integer> al= new ArrayList<>(List.of(10,20,5,30));
        Iterator itr = al.iterator();
        int k = 10;
        while(itr.hasNext()){
            int x=(Integer)itr.next();
            if(x<k)
                itr.remove();
            else
                System.out.println(x);
        }
        System.out.println(al);
    }
}
