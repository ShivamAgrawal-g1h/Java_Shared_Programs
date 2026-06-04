package DSA_basics.Arrays;

class Q8_MagicTriplets {
    public int countTriplets(int[] nums) {
        // Method-1
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             if(nums[i] < nums[j] && nums[j] < nums[k]) count++;
        //         }
        //     }
        // }
        // return count;


        int count =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int left = 0, right = 0;
            for(int j=i-1; j>=0; j--){
                if(nums[j] < nums[i]) left++;
            }
            for(int j=i+1; j<n; j++){
                if(nums[i] < nums[j]) right++;
            }
            count += left*right;
        }
        return count;

    }
}
