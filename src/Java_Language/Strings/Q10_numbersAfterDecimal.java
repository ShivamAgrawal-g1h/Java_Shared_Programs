package Java_Language.Strings;
import java.util.Scanner;
public class Q10_numbersAfterDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        digits_after_decimal_point(st);
    }
    public static void digits_after_decimal_point(String s){
        int pos = s.indexOf('.');
        String ans = s.substring(pos+1);
        System.out.println(ans);
    }
}
