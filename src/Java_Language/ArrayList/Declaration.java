package Java_Language.ArrayList;
import java.util.ArrayList;
class Declaration {
    public static void main(String[] args) {
        // 1. ArrayList() - Creates an empty ArrayList with default initial capacity.
        ArrayList<Integer> a = new ArrayList<>();

        // 2. ArrayList(int initialCapacity) - initial capacity being specified.
        // ArrayList<Double> a = new ArrayList<>(20);

        // 3. ArrayList(Collection<? extends E> c) - Creates an ArrayList initialized with elements from the specified collection.
        // ArrayList<String> arr = new ArrayList<>(collection);
        a.add(10);
        a.add(5);
        System.out.println(a);
    }
}
