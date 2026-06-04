package DSA.Searching;
class Searching{
    void main() {
        int[] arr = {29,298,912,1234};
        System.out.println(linear(arr,298));
        System.out.println(bin_itr(arr,298));
        System.out.println(bin_rec(arr,298,0, arr.length));
    }
    int linear(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
    /*
    Average Case Time Complexity: O(N) slow for large datasets.
    Auxiliary Space: O(1)
    When to use Linear Search?
    ->When we are dealing with a small dataset.
    ->When you are searching for a dataset stored in contiguous memory.(Cache Friendly)
    ->Unsorted Data
     */
    int bin_rec(int[] arr, int x,int i, int j){
        if(i<=j){ ///
            int mid_idx = (i+j)/2;
            if(arr[mid_idx]==x) return mid_idx;
            else if(arr[mid_idx]>x) return bin_rec(arr,x,i,mid_idx-1);
            else return bin_rec(arr,x,mid_idx+1,j);
        }
        return -1;
    }
    /*
    Time Complexity: O(logN)
    Auxiliary Space: O(1),If the recursive call stack is considered
    then the auxiliary space will be O(logN).
     */
    /*
    Binary Search is defined as a searching algorithm used in a sorted array by
    repeatedly dividing the search interval in half. The idea of binary search is to
    use the information that the array is sorted and reduce
    the time complexity to O(log N).

    To apply binary search in any data structure, the data structure must maintain the following properties:

    The data structure must be sorted.
    Access to any element of the data structure takes constant time.

    When to use Binary Search?
    ->When searching a large dataset as it has a time complexity of O(log n), which means that it is much faster than linear search.
    ->Data does not have a complex structure or relationships.
    ->When the dataset is sorted.
     */
    int bin_itr(int[] arr, int x){
        for(int i=0,j=arr.length; i<=j;){
            int mid = (i+j)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) j = mid-1; ///
            else i= mid+1;
        }
        return -1;
    }
    /*
    Time Complexity: O(log N)
    Auxiliary Space: O(1)
     */


}
