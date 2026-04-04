package DSA.Searching;
class JumpSearch {
    void main(){
        int[] arr = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        // Find the index of 'x' using Jump Search
        int index = jumpSearch_itr(arr, x);
        System.out.println("\nNumber " + x + " is at index " + index);
    }
    int jumpSearch_itr(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);// block size
        // Finding the block where element is present
        int prev = 0;
        if(x>arr[n-1] || x<arr[0]) return -1;
        for(int i=0; i<n; i+=step){
            if(arr[i]==x) return i;
            if (arr[i] > x) break;
            prev = i;
        }
        // Linear search in the block
        int stop = Math.min(prev+step,n);
        for(int j=prev; j<stop; j++){
            if(arr[j]==x) return j;
        }
        return -1;
    }
    int jumpSearch_rec(int[] arr, int x){
        int n = arr.length;
        if(x<arr[0]||x>arr[n-1]) return -1;
        int step = (int) Math.sqrt(n);
        return rec_part(arr,x,0,step);
    }
    int rec_part(int[] arr, int x, int prev,int step){
        int n = arr.length;
        if(prev>n-1)
            return linear(arr, x, prev-step, n);
        if(arr[prev]==x) return prev;
        else if(x<arr[prev])
            return linear(arr, x, prev-step, prev);
        return rec_part(arr,x,prev+step,step);
    }
    int linear(int[] arr, int x, int start, int end){
        for(int i=start; i<end; i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
}
