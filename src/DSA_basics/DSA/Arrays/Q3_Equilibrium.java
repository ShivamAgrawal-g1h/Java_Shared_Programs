package DSA.Arrays;

class Q3_Equilibrium {
    static int findEquilibrium(int[] arr) {
        int n = arr.length;

        int[] prefixS = new int[n];
        prefixS[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixS[i] = prefixS[i-1] + arr[i];
        }

        for(int i=1; i<n; i++){
            int left = prefixS[i-1];
            int right = prefixS[n-1]-prefixS[i];
            if(left == right) return i;
        }
        return -1;
    }
}
