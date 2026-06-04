package DSA_basics.Hashing;
import java.util.ArrayList;
class Q17_QuadraticProbing {
    public ArrayList<Integer> quadraticProbing(int[] arr, int m) {
        Myhash mh = new Myhash(m);
        for(int ele : arr) mh.add(ele);
        return mh.table;
    }
}
class Myhash{
    int BUCKET;
    ArrayList<Integer> table = new ArrayList<>();
    Myhash(int b){
        BUCKET = b;
        table = new ArrayList<>(b);
        for(int i=0; i<b;i++) table.add(-1);
    }
    int hash(int key){
        return key%BUCKET;
    }
    void add(int k){
        int h = hash(k);
        int i = h;
        int colcount=0;
        while(table.get(i)!=-1){
            if(table.get(i)==k) return;
            i = (h+(colcount*colcount))%BUCKET;
            if(colcount==BUCKET) return;
            colcount++;
        }
        table.set(i,k);
    }
}