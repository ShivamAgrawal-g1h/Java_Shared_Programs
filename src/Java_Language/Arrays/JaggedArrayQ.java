package Java_Language.Arrays;
import java.util.Scanner;
public class JaggedArrayQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] arr = new int[m][];
        for(int i=0; i<arr.length; i++){ // or i<m
            arr[i] = new int[i+1];
            for(int j=0; j<arr[i].length; j++){ // or j<i+1
                arr[i][j] = i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
