package Java_Language.Arrays;
import java.util.Scanner;
public class Q_Distinct_Elements {
    public static boolean rowCheck(int n, int[] row) {
        for (int j = 0; j < row.length; j++) {
            if (row[j] == n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // base row -> 1st row
        int[] row1 = new int[n];
        for (int i = 0; i < n; i++) {
            row1[i] = arr[0][i];
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            int element = row1[j];
            // 🔹 Step 1: Skip duplicates in the first row
            boolean alreadyCounted = false;
            for (int k = 0; k < j; k++) {
                if (row1[k] == element) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;
            // 🔹 Step 2: Check if element is common in all rows
            boolean isCommon = true;
            for (int i = 1; i < m; i++) {
                if (rowCheck(element, arr[i])) continue;
                else{    isCommon = false;
                    break;
                }
            }
            // 🔹 Step 3: If common across all rows, increment count
            if (isCommon) count++;
        }
        System.out.println(count);
    }
}
