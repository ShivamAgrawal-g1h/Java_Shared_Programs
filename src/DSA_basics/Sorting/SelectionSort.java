package DSA_basics.Sorting;

class SelectionSort {
    // original selection sort
//    void selectionSort(int[] arr) {
//        int n = arr.length;
//        int minIdx;
//        for(int i=0; i<n-1; i++){
//            minIdx = i;
//            for(int j=i+1; j<n; j++){
//                if(arr[minIdx]>arr[j]) minIdx = j;
//            }
//            int temp = arr[minIdx];
//            arr[minIdx] = arr[i];
//            arr[i] = temp;
//            // or just -> a = a+b - (b=a); i.e.
//            // arr[i] = arr[i]+arr[minIdx] - (arr[minIdx]=arr[i]);
//        }
//    }


    // stable selection sort
    void selectionSort(int[] arr) {
        int n = arr.length;
        int minIdx;
        for (int i = 0; i < n-1; i++) {
            minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int key = arr[minIdx]; // store min value

            // right shift elements instead of swapping
            while (minIdx > i) {
                arr[minIdx] = arr[minIdx - 1];
                minIdx--;
            }
            arr[i] = key;
        }
    }
}
