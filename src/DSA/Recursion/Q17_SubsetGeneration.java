package DSA.Recursion;
import java.util.Scanner;
class Q17_SubsetGeneration {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sg(s,"",0);
    }
    static void sg(String str,String curr,int level){
        // decide whether we have reached the level to print the subset we use level
        if(level==str.length()){ // required subset level reached so print it
            System.out.print("\""+curr+"\"");
            return;
        }
        sg(str,curr,++level);
        sg(str,curr+str.substring(level-1,level),level);
    }
}
