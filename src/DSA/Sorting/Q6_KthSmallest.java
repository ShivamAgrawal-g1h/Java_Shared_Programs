package DSA.Sorting;

class Q6_KthSmallest {
    public int kthSmallest(int[] arr, int k) {
        int idx = quickSelect(arr,k);
        if(idx>=0) return arr[idx];
        else return -1;
    }
    int quickSelect(int[] arr,int k){
        int n = arr.length;
        int l=0, h = n-1;
        while(l<=h){
            int p = lpartition(arr,l,h);
            if(p == k-1) return p;
            else if(p > k-1) h = p-1;
            else l = p+1;
        }
        return -1;

    }
    // O(n^2) worst case but O(n) on average
    int lpartition(int[] arr, int l, int h){
        int p = h;
        int i =l-1;
        for(int j=l; j<h; j++){
            if(arr[j]<arr[p]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[p];
        arr[p] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
}
