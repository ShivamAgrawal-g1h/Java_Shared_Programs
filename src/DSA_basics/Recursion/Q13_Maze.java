package DSA_basics.Recursion;
import java.util.Scanner;
class Q13_Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(maze(r,c));
        // or System.out.println(maze(1,1,r,c); for method-2
    }
    static int maze(int m,int n){
        if(n==1 || m ==1) return 1;
        if(m==2) return n;
        if(n==2) return m;
        return maze(m,n-1) + maze(m-1,n);
    }
    // Method-2
    static int maze(int cr, int cc, int er, int ec){/// cr- current row, cc- current column, er- ending row, ec- ending column
        if(cr==er||cc==ec) return 1;
        return maze(cr+1,cc,er,ec) + maze(cr,cc+1,er,ec);
    }
}
