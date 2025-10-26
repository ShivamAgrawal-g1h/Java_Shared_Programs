package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q14_Spiral_filling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        // spiral filling
        int minr = 0, maxr = n-1;
        int minc = 0, maxc = n-1;
        int tne = n*n, count = 0,fill = 1;
        while(count<tne){
            for(int j=minc; j<=maxc; j++){
                arr[minr][j] = fill;
                count++;
                fill++;
            }
            minr++;
            if(count>=tne) break;
            for(int i=minr; i<=maxr; i++){
                arr[i][maxc] = fill;
                fill++;
                count++;
            }
            maxc--;
            if(count>=tne) break;
            for(int j=maxc; j>=minc; j--){
                arr[maxr][j] = fill;
                fill++;
                count++;
            }
            maxr--;
            if(count>=tne) break;
            for(int i=maxr; i>=minr; i--){
                arr[i][minc] = fill;
                fill++;
                count++;
            }
            minc++;
        }
        for(int i=0; i<n ; i++){
            for(int j=0; j<n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
