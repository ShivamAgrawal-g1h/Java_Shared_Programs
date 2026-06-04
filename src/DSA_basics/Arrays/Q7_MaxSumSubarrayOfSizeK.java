package DSA_basics.Arrays;

class Q7_MaxSumSubarrayOfSizeK {
    int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int i=0, j=0;
        int sum = 0;
        for(j=0; j<k; j++){
            sum += arr[j];
        }
        int maxSum = sum;
        while(j<n){
            sum = sum + arr[j] - arr[i];
            if(maxSum<sum) maxSum = sum;
            i++;
            j++;
        }
        return maxSum;
    }
}
