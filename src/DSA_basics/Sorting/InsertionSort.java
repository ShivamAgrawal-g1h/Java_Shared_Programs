package DSA_basics.Sorting;

class InsertionSort{
    // swap based
//    void insertionSort(int arr[]) {
//        int n = arr.length;
//        for(int i=1; i<n; i++){
//            for(int j=i; j>0; j--){
//                if(arr[j-1]<arr[j]) break;
//                int temp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
//            }
//        }
//    }


    // shifting based
//     void insertionSort(int arr[]) {
//        int n = arr.length;
//        for(int i=1; i<n; i++){
//            int key = arr[i]; // value to insert into sorted world
//
//            int j = i;
//            while(j>0){
//                if(arr[j-1]==key || arr[j-1]<key) break;
//                arr[j] = arr[j-1]; // right shift
//                j--;
//            }
//
//            arr[j] = key;
//        }
//    }


    // Binary insertion sort
    void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];

            // find position using binary search
            int low = 0,high = i-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[i]==arr[mid]) low = mid+1;// imp. for stability
                else if(arr[i]>arr[mid]) low = mid+1;
                else high = mid-1;
            }

            // right shift from low to i
            for(int j=i; j>low; j--){
                arr[j] = arr[j-1];
            }

            arr[low] = key;
        }
    }
}
