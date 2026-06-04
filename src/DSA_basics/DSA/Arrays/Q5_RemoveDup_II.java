package DSA.Arrays;

class Q5_RemoveDup_II {
    int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i] != nums[i+2]){
                nums[j++] = nums[i];
            }
        }
        if(n>1) nums[j++] = nums[nums.length-2];
        if(n>0) nums[j++] = nums[nums.length-1];
        return j;
    }
}
