package Java_Language.Strings;
import java.util.Scanner;
public class Q7_Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        if(isPangram(s1)){
            System.out.println("Pangram");
        }
        else System.out.println("Not a pangram");
    }
    //Method-1
//    public static boolean isPangram(String str) {
//        str = str.toLowerCase();
//        int n = str.length();
//        if(n<26) return false;
//        for(int i='a'; i<'a'+26; i++){
//            char element = (char)i;
//            boolean isPresent = false;
//            for(int j=0; j<n; j++){
//                if(element == str.charAt(j)){
//                    isPresent = true;
//                    break;
//                }
//            }
//            if(!isPresent){
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        int n = str.length();
        if(n<26) return false;
        boolean[] visited = new boolean[26];
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
                visited[ch-'a'] = true;
        }
        for(int i=0; i<26; i++){
            if(visited[i]==false)
                return false;
        }
        return true;
    }
}
