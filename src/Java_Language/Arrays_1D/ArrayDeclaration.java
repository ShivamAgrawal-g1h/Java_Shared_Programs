package Java_Language.Arrays;
import java.util.Scanner;
public class ArrayDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2},{3,4}};
        int arr2[][] = {{1,2},{3,4}};
        int[][] brr1 = new int[3][4];
        int[][] brr2 = new int[3][];
        int[][] crr1;
        crr1 = new int[3][4];
        int[][] crr2;
        crr2 = new int[3][];

        // Wrong Ways :
        // int[][] arr;
        // arr = {{1,2},{4,5}};

        // int[3][] brr;

        //int[][] crr3;
        //crr3 = new int[][];

        // int[][] crr4;
        //  crr4 = new int[][4];
    }
}
