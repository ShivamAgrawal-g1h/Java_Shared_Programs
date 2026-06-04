package DSA_basics.Sorting;

class Q7_RadixSortForNegative {
    // Negative numbers handling :
    void rSort(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        for(int ele : nums) min = min > ele ? ele : min;
        if(min<0) for(int i=0; i<n; i++) nums[i] -= min;

        int max = nums[0];
        for(int ele : nums) max = max < ele ? ele : max;
        for(int exp = 1; max/exp > 0; exp *= 10){
            countingSort(nums, exp);
        }
        if(min<0) for(int i=0; i<n; i++) nums[i] += min;
    }
    public static void countingSort(int[] arr, int exp){
        int n = arr.length;
        int[] count = new int[10];
        int[] output = new int[n];
        for(int i=0; i<n; i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1; i<10; i++) count[i] += count[i-1];
        for(int i=n-1; i>=0; i--){
            output[ count[(arr[i]/exp)%10] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
}
