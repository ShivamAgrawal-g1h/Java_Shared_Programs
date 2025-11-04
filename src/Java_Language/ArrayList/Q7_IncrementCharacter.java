package Java_Language.ArrayList;
import java.util.Scanner;
class Q7_IncrementCharacter {
    public static String manipulateIt(String s) {
        int n = s.length();
        StringBuilder lower =
                new StringBuilder("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        StringBuilder upper =
                new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i += 2){
            String oldLetter = s.substring(i, i + 1);
            int shift = s.charAt(i + 1) - '0';

            char ch = oldLetter.charAt(0);

            if(Character.isLowerCase(ch)){
                int idx = lower.indexOf(oldLetter);
                ans.append(lower.substring(idx + shift, idx + shift + 1));
            }
            else if(Character.isUpperCase(ch)){
                int idx = upper.indexOf(oldLetter);
                ans.append(upper.substring(idx + shift, idx + shift + 1));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String shiftedString = manipulateIt(str);
        System.out.println(shiftedString);
    }
}
