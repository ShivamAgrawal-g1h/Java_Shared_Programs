package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q5_Max_1 {
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
        int maxCount=0;
        for(int i=0; i<r; i++){
            int count=0;
            for(int j=0; j<c; j++){
                count += arr[i][j];
            }
            if(maxCount<count)  maxCount = count;
        }
        for(int i=0; i<r; i++){
            int count=0;
            for(int j=0; j<c; j++){
                count += arr[i][j];
            }
            if(maxCount==count) System.out.println(i+" index row has the highest number of 1's : "+maxCount);
        }
    }
}
