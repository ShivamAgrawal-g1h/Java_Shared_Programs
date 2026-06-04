package DSA_basics.Recursion;
class Q16_RopeCutting {
    static void main() {
        System.out.println(rc(20,10,11,3));
    }
    static int rc(int n, int a, int b, int c){
        if(n==0) return 0; //Why 0 is correct, Rope is perfectly used
        // No more cuts possible
        // Number of pieces added at this level = 0

        if(n<0) return -1;
        int cuts = max(max(rc(n-a,a,b,c),rc(n-b,a,b,c)),rc(n-c,a,b,c));
        if(cuts==-1)
            return -1; // return ways;
        else
            return cuts+1;
    }
    static int max(int x, int y){
        return x>y ? x : y;
    }
    //better solution in Dynamic programming track
    //Time Complexity : O(3^n)
    //Space Complexity : O(n), due to recursive call stack.
}
