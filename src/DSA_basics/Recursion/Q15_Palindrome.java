package DSA_basics.Recursion;
import java.util.Scanner;
class Q15_Palindrome {
    static void palindrome(String s){
        if(s==null) return;
        if(s.equals(reverse(s,s.length())))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
    static String reverse(String s,int length){
        if(length<2) return s;
        return reverse(s.substring(1),length-1)+s.substring(0,1);
    }
    static boolean palindrome(String s,int start, int end){
        if(start>=end) return true;
        return s.charAt(start) == s.charAt(end) &&
                palindrome(s,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindrome(str);
    }
}
