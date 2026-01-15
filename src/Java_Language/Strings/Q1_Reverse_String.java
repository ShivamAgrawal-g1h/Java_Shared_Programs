package Java_Language.Strings;
import java.util.Scanner;
public class Q1_Reverse_String {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     // Method-1(simple but slow)
//     String reverse = "";
//     for(int i=0; i<s.length(); i++){
//         reverse += s.charAt(s.length()-1-i);
//     }
//     System.out.println(reverse);

        //Method-2(best among all 3)
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);

        //Method-3(moderate)
        s = reverse(s);
        System.out.println(s);
    }
    public static String reverse(String str) {
        if(str==null || str.length()==1) return str;
        return str.substring(1)+str.charAt(0);
    }
}
