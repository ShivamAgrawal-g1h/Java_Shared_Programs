package DSA_basics.Searching;

class Q9_CountOnes {
    public int countOnes(int[] arr) {
        // code here
        int low = 0, high = arr.length - 1;
        int lastIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                lastIndex = mid;      // Potentially the last 1
                low = mid + 1;        // Look to the right
            } else {
                high = mid - 1;       // Look to the left
            }
        }

        // If lastIndex is -1, there are no 1s in the array
        return lastIndex + 1;
    }
}
