package DSA.Sorting;

class Q10_Sort0s1s2s {
    public void sort012(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                //swap arr[mid] with arr[i]
                arr[low] = arr[mid] + (arr[mid] = arr[low]) - arr[low];
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                arr[high] = arr[mid] + (arr[mid] = arr[high]) - arr[high];
                high--;
            }
        }
    }
}
