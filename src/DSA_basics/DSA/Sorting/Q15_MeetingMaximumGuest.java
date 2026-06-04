package DSA.Sorting;

import java.util.Arrays;

class Q15_MeetingMaximumGuest {
    static void main() {

    }
    static int maxGuest(int[] arr, int[] dep){
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int maxCount = 0;
        int i=0, j=0;
        int count = 0;
        int time = 0;
        while(i<n && j<n){
            if(arr[i] < dep[j]){
                count++;
                i++;
            }
            else if(arr[i] == dep[j]){
                i++;
            }
            else{
                j++;
                count--;
            }
            if(maxCount < count){
                maxCount = count;
                time = i-1;
            }
        }
        return maxCount;
    }
}
