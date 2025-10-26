package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q3_RectangleSum {
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
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        int startRow = l1;
        if(l2<l1) startRow = l2;
        int startColumn = r1;
        if(r2<r1) startColumn = r2;
        int endRow = l1+l2-startRow;
        int endColumn = r1+r2-startColumn;
        int sum = 0;
        for(int i=startRow; i<=endRow; i++){
            for(int j=startColumn; j<=endColumn; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum : "+sum);
    }
}
