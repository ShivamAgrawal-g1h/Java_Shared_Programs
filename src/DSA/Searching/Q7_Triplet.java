package DSA.Searching;

import java.util.Arrays;
import java.util.HashSet;

class Q7_Triplet {
    void main() {
    }
    // [Naive Approach] Generating All Triplets - O(n^3) Time and O(1) Space
//    boolean hasTripletSum(int[] arr, int target) {
//        int n = arr.length;
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++){
//                for (int k = j + 1; k < n; k++) {
//                    if (arr[i] + arr[j] + arr[k] == target)
//                        return true; // If a triplet is found
//                }
//            }
//        }
//        return false;
//    }


    //[Better Approach] - Hash Set - O(n^2) Time and O(n) Space
//    boolean hasTripletSum(int[] arr, int target) {
//        int n = arr.length;
//        for (int i = 0; i < n - 2; i++) {
//            int target2 = target - arr[i];
//            HashSet<Integer> set = new HashSet<>();
//            for (int j = i + 1; j < n; j++) {
//                int rem = target2 - arr[j];
//                // second ele will be target2 - 3rd
//                // Search for second element in hash set
//                if (set.contains(rem)) {
//                    return true;
//                }
//                set.add(arr[j]);
//            }
//        }
//
//        return false;
//    }

    // [Expected Approach] - Sorting and Two Pointer - O(n^2) Time and O(1) Space
    boolean hasTripletSum(int[] arr, int target) {
        // code Here
        Arrays.sort(arr);
        int n =arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int target2 = target - arr[i];
            int j = i+1, k = n-1;
            while(j<k){
                if(arr[j]+arr[k]==target2){
                    return true;
                }
                else if(arr[j]+arr[k]>target2) k--;
                else j++;
            }
        }
        return false;
    }

}