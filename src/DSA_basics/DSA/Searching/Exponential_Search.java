package DSA.Searching;

class Exponential_Search {
    int expo_search(int[] arr, int x){
        if(x<arr[0]) return -1;
        if(x==arr[0]) return 0;
        int i = 1;
        int n = arr.length;

        // Find range
        while(i<n && arr[i]<=x){
            if(i>n/2) i = n;
            else i = i*2;
        }

        // Binary search in found range
        return binarySearch(arr, i/2, Math.min(i, n - 1), x);
    }
    int binarySearch(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) return mid;
            else if (x > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
