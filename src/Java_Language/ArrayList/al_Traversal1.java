package Java_Language.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class al_Traversal1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Learn");
        list.add("and");
        list.add("Grow");
        // get method
        System.out.println("(1) get method");
        for(int i =0 ; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        // for each loop
        System.out.println("(2) For each loop");
        for(String str : list){
            System.out.println(str);
        }
        // for each method
        System.out.println("(3)For each method");
        list.forEach(iterator -> System.out.println(iterator));
        // iterator method
        System.out.println("(4)iterator method");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}
