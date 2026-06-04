package DSA_basics.Sorting;

import java.util.Arrays;

class Q16_MinPlatforms {
    public int minPlatform(int arr[], int dep[]) {
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int maxCount = 0;
        int i=0, j=0;
        int count = 0;
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                count++; i++;
            }
            else{
                count--; j++;
            }
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;
    }
}
