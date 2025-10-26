package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q1_AddMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] brr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                brr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = arr[i][j] + brr[i][j];
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
