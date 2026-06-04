package DSA_basics.Recursion;
import java.util.Scanner;
class Q20_Hanoi {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("for "+n+" number of disks, min ways = "+towerOfHanoi(n));
        TOH(n,'A','B','C');
    }
    static int towerOfHanoi(int n) {
        if(n==0) return 0;// (or) if(n==1) return 1;
        return 2*towerOfHanoi(n-1)+1;
    }
    static void TOH(int n,char s, char h, char d){
        if(n==1){
            System.out.println("move disk 1 from "+s+" to "+d);
            return;
        }
        TOH(n-1,s,d,h);
        System.out.println("move disk "+n+" from "+s+" to "+d);
        TOH(n-1,h,s,d);
    }
}
/*
Key Aspects of the Tower of Hanoi Recurrence.
Recurrence Relation: T(n)=2T(n-1)+1
Base Case: T(1)=1
Closed-Form Solution: T(n)=2^{n}-1
Time Complexity: O(2^{n})
Step-by-Step Breakdown:
Move n-1 disks from Source to Auxiliary: T(n-1) moves.
Move largest disk from Source to Destination: 1 move.
Move n-1 disks from Auxiliary to Destination: T(n-1) moves.
Total: T(n-1)+1+T(n-1) = 2T(n-1)+1
 */
