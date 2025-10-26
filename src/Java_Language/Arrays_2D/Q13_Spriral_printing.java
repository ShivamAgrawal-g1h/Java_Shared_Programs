package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q13_Spriral_printing {
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
        int minr=0, maxr=r-1;
        int minc=0, maxc=c-1;
        int tne = r*c, count = 0;
        while(count<tne){
            for(int j=minc; j<=maxc; j++) {
                System.out.print(arr[minr][j]+" ");
                count++;
            }
            minr++;
            if(count>=tne) break;
            for(int i=minr; i<=maxr; i++) {
                System.out.print(arr[i][maxc]+" ");
                count++;
            }
            maxc--;
            if(count>=tne) break;
            for(int j=maxc; j>=minc; j--) {
                System.out.print(arr[maxr][j]+" ");
                count++;
            }
            maxr--;
            if(count>=tne) break;
            for(int i=maxr; i>=minr; i--) {
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
        }
    }
}
