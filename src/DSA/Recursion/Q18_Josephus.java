package DSA.Recursion;
class Q18_Josephus {
    static void main() {
        System.out.println(jos(5,3));
    }
    static int jos(int n, int k){
        // n people in a circle , counting starts in fixed direction from any pt.
        // in each step k-1 people are skipped, kth killed
        // last given freedom
        // choose starting pt. for you to save yourself
        //k = k%n;
        // for 0 based indexing
        if(n==1) return 0;
        return (jos(n-1,k)+k)%n;
        // for 1 based indexing
        // if(n==1) return 1;
        // return (jos(n-1,k)+k-1)%n+1;
    }
}
