package DSA.Sorting;
import java.util.ArrayList;
/**
 Given two sorted arrays arr1[] and arr2[].
 Your task is to return the intersection of both arrays.
 Intersection of two arrays is said to be elements that are common
 in both arrays. The intersection should not count duplicate elements.
 Note: If there is no intersection then return an empty array.
 */
class Q2_IntersectionOf2Arrays {
    public ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        // int m = arr1.length;
        // int n = arr2.length;
        // ArrayList<Integer> al = new ArrayList<Integer>(m);
        // for(int i=0; i<m; i++){
        //     if(i>0 && arr1[i] == arr1[i-1]){
        //         continue;
        //     }
        //     for(int j=0; j<n; j++){
        //         if(arr1[i] == arr2[j]){
        //             al.add(arr1[i]);
        //             break;
        //         }
        //     }
        // }
        // return al;
        // O(n*m)


        int m = arr1.length;
        int n = arr2.length;
        ArrayList<Integer> al = new ArrayList<Integer>(m);
        int i=0, j=0;
        while(i<m && j<n){
            if(i>0 && arr1[i] == arr1[i-1]){
                i++; continue;
            }
            else if(arr1[i] < arr2[j]) i++;
            else if(arr1[i] == arr2[j] ){
                al.add(arr1[i]); i++; j++;
            }
            else j++;
        }
        return al;
        // O(n+m)
    }
}
