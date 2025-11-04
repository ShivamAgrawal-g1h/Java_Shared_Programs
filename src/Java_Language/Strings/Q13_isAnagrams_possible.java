package Java_Language.Strings;
import java.util.Scanner;
public class Q13_isAnagrams_possible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(anagram(s1,s2));
    }
    public static boolean anagram(String s1, String s2){
        int n1 = s1.length(), n2 = s2.length();
        if(n1<n2) return false;

        int[] count = new int[26];
        for(int i=0; i<n2; i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int i=n2; i<n1; i++){
            count[s1.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if(count[i]== -1) return false;
        }
        return true;
    }
}
