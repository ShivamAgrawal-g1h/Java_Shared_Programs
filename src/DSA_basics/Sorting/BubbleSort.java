package DSA_basics.Sorting;

class BubbleSort {
//    void bubbleSort(int[] arr){
//        int n = arr.length;
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-1-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }


    // optimized
    void bubbleSort(int[] arr) {
        boolean sorted;
        for(int i=0; i<arr.length-1; i++){
            sorted = true;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) return;
        }
    }
}
