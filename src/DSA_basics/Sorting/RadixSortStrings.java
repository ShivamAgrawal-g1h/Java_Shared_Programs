package DSA_basics.Sorting;
import java.util.Arrays;
/**
 * Key Logic
 * Maximum Length: The algorithm first finds the longest string to determine how many passes are needed.
 *
 * Stability: A stable sort (like counting sort) is mandatory; it ensures that if two strings have the
 * same character at the current position, their relative order from previous passes is preserved.
 *
 * Padding: When a string is shorter than the current index d, it is assigned a value of 0. This ensures
 * "apple" correctly follows "app" (lexicographical order).
 *
 * Complexity: The time complexity is O( W*N )
 * , where
 *  W is the length of the longest string and
 *  N is the number of strings.
 */

class RadixSortStrings {
    static void rSort(String[] arr) {
        int maxLen = 0;
        for (String s : arr) maxLen = Math.max(maxLen, s.length());

        System.out.println("Before Sorting : "+Arrays.toString(arr));
        // Sort from rightmost character to leftmost
        for (int d = maxLen - 1; d >= 0; d--) {
            countingSortByChar(arr, d);
            System.out.println("After Step No. : "+(maxLen-d)+" : "+Arrays.toString(arr));
        }
    }

    static void countingSortByChar(String[] arr, int d) {
        int n = arr.length;
        String[] output = new String[n];
        int[] count = new int[256 + 1]; // ASCII range + 1 for padding

        // Count frequencies (use 0 for strings shorter than d)
        for (String s : arr) {
            int charIndex = (d < s.length()) ? (s.charAt(d) + 1) : 0;
            count[charIndex]++;
        }

        // Build cumulative count
        for (int i = 1; i < 257; i++) count[i] += count[i - 1];

        // Place elements in stable order
        for (int i = n - 1; i >= 0; i--) {
            int charIndex = (d < arr[i].length()) ? (arr[i].charAt(d) + 1) : 0;
            output[--count[charIndex]] = arr[i];
        }
        System.arraycopy(output, 0, arr, 0, n);
    }

    static void main(String[] args) {
        System.out.println((char)0);
        String[] data = {"apple", "pear", "app", "banana", "peach"};
        rSort(data);
        System.out.println(Arrays.toString(data)); // [app, apple, banana, peach, pear]
    }
}
