package DSA.Sorting;

class Q4_NaivePartition {
    void partition(int[] arr, int l, int h, int p){
        int[] temp = new int[h-l+1];
        int idx = 0;
        for(int i=l; i<h+1; i++)
            if(arr[i]<=arr[p] && i!=p) temp[idx++] = arr[i];
        temp[idx++] = arr[p];
        for(int i=l; i<h+1; i++)
            if(arr[i]>arr[p]) temp[idx++] = arr[i];
        idx = 0;
        for(int i=l; i<h+1; i++)
            arr[i] = temp[idx++];
    }
}
