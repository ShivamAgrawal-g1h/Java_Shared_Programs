package DSA_basics.Sorting;

class MergeSort {
    void main() {
        int[] arr = {5,2,8,4,1,6,7,3};
        mergeSort(arr);
        for(int ele : arr) System.out.print(ele+" ");
    }
//    void mergeSort(int[] arr) {
//        int n = arr.length;
//        if(n==1) return; // 1 length array is sorted
//
//        // Step-1 : Make 2 empty arrays of size n/2, n-n/2
//        int[] a = new int[n-n/2];
//        int[] b = new int[n/2];
//        // Step-2 : copy the elements of arr into a and b
//        int idx = 0;
//        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
//        for(int i=0; i<b.length; i++) b[i] = arr[idx++];
//        // Step-3 : Magic(Recursion)
//        mergeSort(a);
//        mergeSort(b);
//        //Step-4 : Merge two sorted arrays a and b in original array
//        merge(a,b,arr);
//    }
//    void merge(int[] a, int[] b, int[] c) {
//        int i=0, j=0, k=0;
//        while(i<a.length && j<b.length){
//            if(a[i]<=b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        while(i<a.length) c[k++] = a[i++];
//        while(j<b.length) c[k++] = b[j++];
//    }

    // Optimised approach (in-place dividing , A.S. = O(n) for merging)
//    void mergeSort(int[] arr, int left, int right) {
//        if (left >= right) return; // left = right means only 1 element range , left > right - no element...
//        int mid = left + (right-left)/2;
//
//        mergeSort(arr, left, mid);
//        mergeSort(arr, mid + 1, right);
//
//        merge(arr, left, mid, right);
//    }
//    void merge(int[] arr, int left, int mid, int right) {
//        int[] temp = new int[right - left + 1];
//
//        int i = left;      // left half
//        int j = mid + 1;   // right half
//        int k = 0;
//
//        while (i <= mid && j <= right) {
//            if (arr[i] <= arr[j])temp[k++] = arr[i++];
//            else temp[k++] = arr[j++];
//        }
//
//        while (i <= mid) temp[k++] = arr[i++];
//        while (j <= right) temp[k++] = arr[j++];
//
//        // copy back to original array
//        for (int u = 0; u < temp.length; u++) {
//            arr[left + u] = temp[u];
//        }
//    }



    void mergeSort(int[] arr) {
        int n = arr.length;
        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += 2 * size) {

                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);
                // Merge the subarrays arr[leftStart...mid]
                // and arr[mid+1...rightEnd]
                merge(arr, left, mid, right);
            }
        }
    }
    void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int u = 0; u < temp.length; u++) {
            arr[left + u] = temp[u];
        }
    }
}
