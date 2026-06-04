package DSA_basics.Hashing;
import java.util.ArrayList;

class Implement_Chaining {
    static void main() {
        MyHash mh = new MyHash(7);
        mh.insert(70);
        mh.insert(71);
        mh.insert(9);
        mh.insert(56);
        mh.insert(72);
        System.out.println(mh.search(56));
        mh.delete(9);
        System.out.println(mh.search(57));
    }
}
class MyHash
{
    int BUCKET;
    ArrayList<ArrayList<Integer>> table; // Hash Table
    MyHash(int b)
    {
        BUCKET = b;
        table = new ArrayList<>();
        for (int i=0; i<b; i++)
            table.add(new ArrayList<Integer>());
    }
    void insert(Integer k)
    {
        int i = k % BUCKET; // Hash function
        table.get(i).add(k);
    }
    boolean search(Integer k)
    {
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).remove(k);
    }
}
/*
class Implement_Chaining {
    static void main() {
        MyHash mh = new MyHash(7);
        mh.insert(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(7);
        System.out.println(mh.search(10));
        mh.delete(15);
        System.out.println(mh.search(15));
    }
}
class MyHash
{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table; // Hash Table
    MyHash(int b)
    {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i=0; i<b; i++)
            table.add(new LinkedList<Integer>());
    }
    void insert(Integer k)
    {
        int i = k % BUCKET; // Hash function
        table.get(i).add(k);
    }
    boolean search(Integer k)
    {
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).remove(k);
    }
}
 */
