package Java_Language.Arrays_2D;
import java.util.Scanner;
public class Q2_Min_Max {
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
        int max = arr[0][0], min = arr[0][0];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(max<arr[i][j]) max = arr[i][j];
                if(min>arr[i][j]) min = arr[i][j];
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(max == arr[i][j]) System.out.println("Max value : "+max+"with index : "+i+","+j);
                if(min == arr[i][j]) System.out.println("Min value : "+min+"with index : "+i+","+j);
            }
        }
    }
}
