package DSA.Hashing;
import java.util.ArrayList;
class Q16_LinearProbing {
    public ArrayList<Integer> linearProbing(int[] arr, int m) {
        // code here
        Myhash mh = new Myhash(m);
        for(int ele : arr) mh.add(ele);
        return mh.table;
    }
    class Myhash{
        int BUCKET;
        ArrayList<Integer> table;
        Myhash(int b){
            BUCKET = b;
            table = new ArrayList<>(b);
            for(int i=0; i<b; i++)
                table.add(-1);
        }
        int hash(int key){
            return key%BUCKET;
        }
        void add(int k){
            int h = hash(k);
            int i = h;
            while(table.get(i)!=-1){
                if(table.get(i)==k) return;
                i = (i+1)%BUCKET;
                if(i==h) return;
            }
            table.set(i,k);
        }
    }
}
