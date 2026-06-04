package DSA_basics.Sorting;
/*
How It Works (LSD Radix Sort)
The most common version, Least Significant Digit (LSD) Radix Sort, operates as follows :

1.  Start with the least significant digit (the ones place).
2.  Distribute numbers into "buckets" (usually an array of 10 lists/queues for base-10 numbers)
    based on their value at the current digit position. For example, 410 and 20 would both
    go into the '0' bucket in the first pass.
3.  Collect numbers from the buckets in order (0 through 9) back into a single list.
4.  Due to the stability of the underlying sort, numbers with the same digit value are
    now ordered correctly relative to each other based on the previous digits processed.
5.  Repeat the process for the next significant digit (tens place, then hundreds place, and so on).

Finish after processing all digits of the largest number in the input list.
The list will be completely sorted.
 */
class RadixSort {
    void main (String[] args) {
        int arr[] = {319 ,212 ,6 ,8 ,100 ,50};
        int n = arr.length;
        System.out.println("Original Array :");
        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");

        radixSort(arr,n);

        System.out.println();
        System.out.println("After Sorting :");
        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");

    }
    void radixSort(int arr[], int n) {
        // code here
        int max = arr[0];
        for(int i=1; i<n; i++){
            max = max < arr[i] ? arr[i] : max;
        }
        // exp represents a power of 10;
        for(int exp = 1; max/exp > 0 ; exp *= 10){
            countingSort(arr, exp);
        }
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
}
