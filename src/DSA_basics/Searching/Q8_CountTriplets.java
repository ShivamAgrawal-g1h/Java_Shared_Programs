package DSA_basics.Searching;

class Q8_CountTriplets {
    void main() {
    }
    // [Naive Approach] Generating All Triplets - O(n^3) Time and O(1) Space
//    int countTriplets(int[] arr, int target) {
//        // Code Here
//        int n =arr.length;
//        int count = 0;
//        for(int i=0; i<n-2; i++){
//            for(int j=i+1; j<n-1; j++){
//                for(int k=j+1; k<n; k++){
//                    if(arr[i]+arr[j]+arr[k]==target) count++;
//                }
//            }
//        }
//        return count;
//    }


    //[Expected Approach] - Sorting and Two Pointer - O(n^2) Time and O(1) Space
    int countTriplets(int[] arr, int target) {
        // Code Here
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int target2 = target - arr[i];
            int j = i + 1, k = n - 1;
            while (j < k) {
                if (arr[j] + arr[k] > target2) k--;
                else if(arr[j] + arr[k] < target2) j++;
                else if (arr[j] + arr[k] == target2) {
                    if (arr[j] == arr[k]){
                        // in a sorted array this means all elements from
                        // jth to kth index are equal (duplicates)
                        // their cominations will be freqC2
                        // i.e. freq(freq-1)/2
                        int freq = k - j + 1;
                        count += freq * (freq - 1) / 2;
                        break;
                    }
                    else if (arr[j] == arr[j + 1] && arr[k - 1] == arr[k]) {
                        int left = 1, right = 1;
                        while (j + 1 < k && arr[j] == arr[j + 1]) {
                            left++;
                            j++;
                        }
                        while (k - 1 > j && arr[k] == arr[k - 1]) {
                            right++;
                            k--;
                        }
                        count += left * right;
                        j++;
                        k--;
                    }
                    else if (arr[j] == arr[j + 1]){
                        count++;
                        j++;
                    }
                    else if (arr[k - 1] == arr[k]){
                        count++;
                        k--;
                    }
                    else {
                        count++;
                        j++;
                        k--;
                    }
                }
            }
        }
        return count;
    }

}