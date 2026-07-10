package Library.Sorting;

import java.util.Arrays;

class q1_ChocolateDistProb {
    public int findMinDiff(int arr[], int m) {
        Arrays.sort(arr);
        int i = 0, j = m-1;
        int diff = Integer.MAX_VALUE;
        while(j<arr.length){
            diff = Math.min(diff, Math.abs(arr[i] - arr[j]));
            i++;
            j++;
        }
        return diff;
    }
}
