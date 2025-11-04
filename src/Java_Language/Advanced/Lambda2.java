package Java_Language.Advanced;
import java.util.ArrayList;
import java.util.List;
class Lambda2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1,2,0,4));
        System.out.print("All elements:");
        al.forEach(n -> System.out.print(n+" ")); //Example1

        System.out.print("Even elements:");
        al.forEach((n) -> { //Example2
            if (n % 2 == 0)
                System.out.print(n+" ");
        });
    }
}
