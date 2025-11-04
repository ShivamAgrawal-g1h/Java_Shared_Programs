package Java_Language.Strings;
import java.util.Scanner;
public class Q9_Pattern_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String pat = sc.nextLine();
        pat_search(s,pat);
    }
    public static void pat_search(String txt,String pat){
        int pos = txt.indexOf(pat);
        if(pos==-1)
            System.out.println("Not found");
        while(pos>=0){
            System.out.print(pos+" ");
            pos = txt.indexOf(pat,pos+1);
        }
    }
}
