package Library.SET;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

class CeilingOnRight {
    void printCeilingRight(int[] arr){
        int n = arr.length;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = arr.length-1; i>=0; i--){
            Integer ceil = set.ceiling(arr[i]);
            set.add(arr[i]);
            if(ceil == null) arr[i] = -1;
            else arr[i] = ceil;
        }
        for(int x : arr)
            System.out.print(x+" ");
    }
}
