package DSA.Hashing;
import java.util.ArrayList;
class Implement_OpenAddressing {
    static void main() {
        MyHash2 mh = new MyHash2(7);
        mh.insert(49);
        mh.insert(56);
        mh.insert(72);
        if(mh.search(56)){
            System.out.println("Yes");
        }
        else System.out.println("No");
        mh.erase(56);
        if(mh.search(56))
            System.out.println("Yes");
        else System.out.println("No");
    }
}
class MyHash2{
    int BUCKET = 8;
    int size;
    int[] table;
    MyHash2(int b){
        BUCKET = b;
        size = 0;//no. of elements initially
        table = new int[b];
        for(int i=0; i<b; i++){
            table[i] = -1;
        }
    }
    int hash(int key){
        return key%BUCKET;
    }
    boolean insert(Integer k){
        if(BUCKET==size) return false; // hash table is full already
        int i = hash(k);
        // linear probing
        while(table[i]!=-1 && table[i]!= -2 && table[i] != k){ // not empty location and
            // not deleted location and not key present already
            i = (i+1)%BUCKET;
        }
        if(table[i]==k) return false;// key already present
        else{
            table[i] = k;
            size++;
            return true;
        }
    }
    boolean search(Integer k){
        int h = hash(k);
        int i= h;
        while(table[i]!=-1){ // 1. empty slot
            if(table[i]==k) return true; // 2. key found
            i = (i+1)%BUCKET; // circular array traversal
            if(i==h) return false; // 3. traversed whole table but not found key
        }
        return false;
    }
    boolean erase(Integer k){
        int h = hash(k);
        int i = h;
        // linear probing
        while(table[i]!=-1){
            if(table[i]==k){
                table[i] = -2; // key found
                return true;
            }
            i = (i+1)%BUCKET;
            if(i==h) return false; // traversed whole table but not found key
        }
        return false;
    }
}
/*
//class MyHash2{
//    int BUCKET = 8;
//    ArrayList<Integer> table;
//    MyHash2(int b){
//        BUCKET = b;
//        table = new ArrayList<>(b);
//    }
//    void insert(Integer k){
//        int i = k%BUCKET;
//        while(table.get(i)!=-1){
//            i = i+1;
//        }
//        table.add(i,k);
//    }
//    boolean search(Integer k){
//        int i= k%BUCKET;
//        while(table.get(i)!=-1 || i<2*BUCKET){
//            i = i+1;
//        }
//        return table.contains(k);
//    }
//    void erase(Integer k){
//        int i = k%BUCKET;
//        table.set(i,-2);
//    }
//}
*/
