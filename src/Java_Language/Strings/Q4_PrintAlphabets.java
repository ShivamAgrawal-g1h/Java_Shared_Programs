package Java_Language.Strings;
import java.util.Scanner;
public class Q4_PrintAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0), c2 = sc.next().charAt(0);
        int start = (int)c1, end = (int)c2;
        for(int i=start; i<=end; i++){
            System.out.print((char)i+" ");
        }
    }
}
