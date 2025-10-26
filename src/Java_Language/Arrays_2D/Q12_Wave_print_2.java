package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q12_Wave_print_2 {
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
        for(int j=0; j<c; j++){
            if(j%2==0){
                for(int i=r-1; i>=0; i--)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
            else{
                for(int i=0; i<r; i++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        }
    }
}
