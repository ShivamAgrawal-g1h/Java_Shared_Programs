package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q4_MaxSumRow {
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
        int maxSum=0;
        for(int i=0; i<r; i++){
            int sum=0;
            for(int j=0; j<c; j++){
                sum += arr[i][j];
            }
            if(maxSum<sum)  maxSum = sum;
        }
        for(int i=0; i<r; i++){
            int sum=0;
            for(int j=0; j<c; j++){
                sum += arr[i][j];
            }
            if(maxSum==sum) System.out.println(i+" index row has the highest sum of : "+maxSum);
        }
    }
}
