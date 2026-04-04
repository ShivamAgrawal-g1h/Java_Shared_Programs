package DSA.Sorting;

import java.util.ArrayList;

/**
 Given two sorted arrays a[] and b[], where each array may
 contain duplicate elements , the task is to return the elements
 in the union of the two arrays in sorted order.
 Union of two arrays can be defined as the set containing
 distinct common elements that are present in either of the arrays.
 */
class Q3_UnionOf2Arrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // method1 - hashset
        // method-2
        int m = a.length; int n  = b.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i=0, j=0;
        while(i<m && j<n){
            if(i>0 && a[i] == a[i-1])   i++;
            else if(j>0 && b[j] == b[j-1])  j++;
            else if(a[i] < b[j])    al.add(a[i++]);
            else if(a[i] > b[j])    al.add(b[j++]);
            else{
                al.add(a[i]); i++; j++;
            }
        }
        while(i<m){
            if(i>0 && a[i] == a[i-1]) i++;
            else al.add(a[i++]);
        }
        while(j<n){
            if(j>0 && b[j] == b[j-1]) j++;
            else al.add(b[j++]);
        }
        return al;
        // O(m+n) time and O(1) aux space
    }
}
