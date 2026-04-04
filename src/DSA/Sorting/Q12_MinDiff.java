package DSA.Sorting;
import java.util.Arrays;

class Q12_MinDiff {
//    int minimumDifference(int[] arr) {
//        int n = arr.length;
//         int diff = Integer.MAX_VALUE;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 int d = arr[i] - arr[j];
//                 if(d<0) d = -d;
//                 diff = diff > d ? d : diff;
//             }
//         }
//         return diff;
//    }
    int minimumDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            diff = Math.min( diff, Math.abs(arr[i+1] - arr[i]));
        }
        return diff;
    }
}
