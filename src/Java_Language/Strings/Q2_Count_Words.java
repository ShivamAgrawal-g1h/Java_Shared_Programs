package Java_Language.Strings;
import java.util.Scanner;
public class Q2_Count_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        if(str==null) System.out.println("Null String");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ') count++;
            //if(i>0 && str.charAt(i)==' ' && str.charAt(i-1)==' ') count--;
        }
        if(str=="") System.out.println("Number of words : 0");
        else if(str!=null) System.out.println("Number of words : "+(count+1));
    }
}
