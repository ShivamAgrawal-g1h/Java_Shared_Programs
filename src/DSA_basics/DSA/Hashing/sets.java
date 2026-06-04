package DSA.Hashing;
import java.util.HashSet;
class sets {
    static void main() {
        HashSet<Integer> set = new HashSet<>();
        set.add(28); set.add(2); set.add(91); set.add(14);
        set.add(11); set.add(45); set.add(3); set.add(2);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(5)+" "+set.contains(14));
        set.remove(45);
        System.out.println(set.contains(45));
        System.out.println(set.size());
        set.add(null);
        System.out.println(set.contains(null));

//        for(int ele : set){
//            System.out.println(ele+" ");
//        }
        set.clear();
    }
}
