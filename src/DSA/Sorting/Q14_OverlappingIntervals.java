package DSA.Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Q14_OverlappingIntervals {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // METHOD-1 : naive : O(n^3)

        // METHOD-2 :
        // 1. sort the array of intervals acc. to starting time
        // for(int i = 0 to arr.length)
        // 2. now pick curr_s = arr[0][0] and curr_e = arr[0][1]
        // 3. if(arr[i][0] > curr_e ) make a array  and al.add({curr_s,curr_e})
        //    else curr_e = arr[i][1]
        int n = arr.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=0; j<n-1-i; j++){
        //         if(arr[j][0] > arr[j+1][0]){
        //             int[] temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        Arrays.sort(arr, Comparator.comparingInt(row -> row[0]));

        ArrayList<int[]> al = new ArrayList<>();
        int curr_s = arr[0][0], curr_e = arr[0][1];
        for(int i=0; i<n; i++){
            if(arr[i][0] > curr_e){ // No overlap
                int[] interval = {curr_s,curr_e};
                al.add(interval);
                curr_s = arr[i][0];
                curr_e = arr[i][1];
            }
            else{ // Overlap Exists
                curr_e = Math.max(curr_e,arr[i][1]);
            }
        }
        int[] interval = {curr_s,curr_e};
        al.add(interval);
        return al;
    }
}
// sort in increasing order of start time OR decresing order of end time