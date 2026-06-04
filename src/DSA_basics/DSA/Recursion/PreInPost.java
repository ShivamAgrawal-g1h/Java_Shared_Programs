package DSA.Recursion;
import java.util.Scanner;
class PreInPost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PreInPost(n);
    }
    static void PreInPost(int n){
        if(n==0) return;
        System.out.println("Pre  - "+n);
        PreInPost(n-1);
        System.out.println("In   - "+n);
        PreInPost(n-1);
        System.out.println("Post - "+n);
    }
}
