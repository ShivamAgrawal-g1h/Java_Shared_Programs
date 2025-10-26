package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q15_Spiral_filling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        // spiral filling
        int minr = 0, maxr = r - 1;
        int minc = 0, maxc = c - 1;
        int tne = r * c, count = 0, fill = 1*2; // 1* any constant as required in the question
        while (count < tne) {
            for (int j = minc; j <= maxc; j++) {
                arr[minr][j] = fill; // question may require filling fill*fill or cube or sqrt,..... so see and fill accordingly
                count++;
                fill+=2;// update as required in the question
            }
            minr++;
            if (count >= tne) break;
            for (int i = minr; i <= maxr; i++) {
                arr[i][maxc] = fill;
                fill+=2;
                count++;
            }
            maxc--;
            if (count >= tne) break;
            for (int j = maxc; j >= minc; j--) {
                arr[maxr][j] = fill;
                fill+=2;
                count++;
            }
            maxr--;
            if (count >= tne) break;
            for (int i = maxr; i >= minr; i--) {
                arr[i][minc] = fill;
                fill+=2;
                count++;
            }
            minc++;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
