package Java_Language.Strings;
import java.util.Arrays;
import java.util.Scanner;
public class Q5_Extra_char {
    //Method-1
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        for(int i=0; i<s2.length(); i++){
            char check = s2.charAt(i);
            boolean found = true;
            for(int j=0; j<s1.length(); j++){
                if(check == s1.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found) System.out.println(check);
//            for(int j=i+1; j<s2.length(); j++){
//                if(s2.charAt(i) == s2.charAt(j)){
//                    System.out.println(s2.charAt(i));
//                    return;
//                }
//            }
        }
        for(int i=0; i<s2.length(); i++){
            for(int j=i+1; j<s2.length(); j++){
                if(s2.charAt(i) == s2.charAt(j)){
                    System.out.println(s2.charAt(i));
                    return;
                }
            }
        }
    } */

    // Method-2(sorting)
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int n = s1.length();
        for(int i=0; i<n; i++){
            if(a1[i]!=a2[i]) {
                System.out.println(a2[i]);
                return;
            }
        }
        System.out.println(a2[n]);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(findExtra(s1, s2));
    }
    //Method-3(counting)
/*    public static char findExtra(String s1, String s2) {
        int count[] = new int[256];
        int n = s1.length();
        // 🔁 Step 1: Count frequency differences
        for (int i = 0; i < n; i++) {
            count[s2.charAt(i)]++;  // increment for s2
            count[s1.charAt(i)]--;  // decrement for s1
        }
        // ➕ Step 2: Handle last character of s2
        count[s2.charAt(n)]++;
        // 🔍 Step 3: Find which character has count = 1
        for (int i = 0; i < 256; i++) {
            if (count[i] == 1)
                return (char) (i);
        }

        return '0';
    }*/
    //Method-4(bitwise XOR)
    public static char findExtra(String s1, String s2){
        int res =0;
        int n = s1.length();
        for(int i=0;i<n;i++)
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        res = res ^ s2.charAt(n);
        return (char)res;
    }
}