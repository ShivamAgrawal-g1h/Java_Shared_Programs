package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q10_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();// no. of rows of 1st matrix
        int n = sc.nextInt();// no. of columns of 1st matrix
        int p = sc.nextInt();// no. of rows of 2nd matrix
        int q = sc.nextInt();// no. of columns of 2nd matrix
        int[][] a = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[p][q];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        if(n!=p) System.out.println("Cannot multiply the input matrices");
        else{
            int[][] res = new int[m][q];
            for(int i=0; i<m; i++){
                for(int j=0; j<q; j++){
                    int element =0;
                    for(int k=0; k<n; k++){
                        element += a[i][k]*b[k][j];
                    }
                    res[i][j] = element;
                }
            }
            for(int i=0; i<m; i++){
                for(int j=0; j<q; j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
