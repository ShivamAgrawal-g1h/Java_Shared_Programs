package Java_Language.Strings;
import java.util.Arrays;
import java.util.Scanner;
public class Q8_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(isAnagram(s1,s2)) System.out.println("Anagram");
        else System.out.println("Not a Anagram");
    }
    public static boolean isAnagram(String s1,String s2) {
        //Method-1
//        int[] count = new int[256];
//        int n1 = s1.length(), n2 = s2.length();
//        if(n1!=n2) return false;
//        for(int i=0; i<n1;i++){
//            count[s2.charAt(i)]++;
//            count[s1.charAt(i)]--;
//        }
//        for(int i=0; i<256; i++){
//            if(count[i]!=0)
//                return false;
//        }
//        return true;
        // Method-2
        if(s1.length()!=s2.length()) return false;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        s1 = new String(a1);
        s2 = new String(a2);
        return s1.equals(s2);
    }
}
