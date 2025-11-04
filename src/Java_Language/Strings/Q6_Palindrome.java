package Java_Language.Strings;
import java.util.Scanner;
public class Q6_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        boolean flag = true;
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)==s.charAt(n-1-i)) continue;
            else flag = false;
        }
        if(flag) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
