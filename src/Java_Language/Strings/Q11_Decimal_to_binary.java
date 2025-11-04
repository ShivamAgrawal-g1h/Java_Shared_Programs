package Java_Language.Strings;
import java.util.Scanner;
public class Q11_Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dec_to_bin(n);
    }
    public static void dec_to_bin(int n){
        String s = "";
        while(n>0){
            s = n%2 + s;
            n = n/2;
        }
        System.out.println(s);
    }
}
