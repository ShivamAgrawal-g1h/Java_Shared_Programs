package DSA.Arrays;

import java.util.ArrayList;

class Q2_PrefixSumRangeQuery {
    ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {

        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();


        int[] prefixS = new int[n];
        prefixS[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixS[i] = prefixS[i-1] + arr[i];
        }


        int i=0;
        while(i<queries.length){
            int l = queries[i][0];
            int h = queries[i][1];
            int sum = prefixS[h] - prefixS[l] + arr[l];
            al.add(sum);
            i++;
        }
        return al;
    }
}
