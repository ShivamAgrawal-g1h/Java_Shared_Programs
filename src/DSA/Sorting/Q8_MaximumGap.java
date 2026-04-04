package DSA.Sorting;

class Q8_MaximumGap {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n < 2) return 0;
        int min = nums[0];
        for(int ele : nums) min = min > ele ? ele : min;
        if(min<0) for(int i=0; i<n; i++) nums[i] -= min;

        int max = nums[0];
        for(int ele : nums) max = max < ele ? ele : max;
        for(int exp=1; max/exp > 0; exp *= 10){
            countingSort(nums, exp);
        }
        if(min<0) for(int i=0; i<n; i++) nums[i] += min;
        int max_diff = nums[1] - nums[0];
        for(int i=0; i<n-1; i++){
            int curr_diff = nums[i+1] - nums[i];
            if(max_diff < curr_diff) max_diff = curr_diff;
        }
        return max_diff;
    }
    public void countingSort(int[] nums,  int exp){
        int n = nums.length;
        int[] count = new int[10];
        int[] output = new int[n];
        for(int i=0; i<n; i++){
            count[(nums[i]/exp)%10]++;
        }
        for(int i=1; i<10; i++) count[i] += count[i-1];
        for(int i=n-1; i>=0; i--){
            output[ count[(nums[i]/exp)%10]-1 ] = nums[i];
            count[(nums[i]/exp)%10]--;
        }
        for(int i=0; i<n; i++) nums[i] = output[i];
    }
}
