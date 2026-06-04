package DSA_basics.Sorting;

class CountingSort {
    void main() {
        int[] arr = {22,13,12,18,19};
        countSort(arr,25);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
//    void countSort(int[] arr, int k){
//        int n = arr.length;
//        int[] count = new int[k];
//        for(int i=0; i<k; i++) count[i] = 0;
//        for(int i=0; i<n; i++) count[arr[i]]++;
//
//        int index = 0;
//        for(int i=0; i<k; i++){
//            for(int j=0; j<count[i]; j++)
//                arr[index++] = i;
//        }
//    }

    void countSort(int[] arr, int k){
        int n = arr.length;
        int[] count = new int[k];
        for(int i=0; i<k; i++) count[i] = 0;
        for(int i=0; i<n; i++) count[arr[i]]++;

        for(int i=1; i<k; i++)
            count[i] = count[i]+ count[i-1];

        int[] op = new int[n];
        for(int i=n-1; i>=0; i--)
        {
            op[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for(int i=0 ;i<n ;i++) arr[i] = op[i];
    }
}
