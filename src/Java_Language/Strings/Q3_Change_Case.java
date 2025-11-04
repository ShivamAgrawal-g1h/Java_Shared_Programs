package Java_Language.Strings;
import java.util.Scanner;
public class Q3_Change_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String first = str.substring(0,1).toUpperCase();
        String rest = str.substring(1);
        str = first + rest;
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);
    }
}
