package Java_Language.InputOutput;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
class FastIO3 {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int k = fr.nextInt();
        int count = 0;
        while (n-- > 0) {
            int x = fr.nextInt();
            if (x % k == 0) count++;
        }
        //System.out.println(count);
        PrintWriter out = new PrintWriter(System.out);
        // more efficient way is below : (This reduces OS write calls → faster for heavy output.)
        //PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // or
        //PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        //slightly slower in the specific context of competitive programming due to the extra layer
        // of character encoding logic, so prefer the above one.
        out.println(count);
        //out.flush();// redundant
        out.close();//Releases resources ,Flushes automatically
    }
    // Standard FastReader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st; // Faster than split()
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    //For CP : Assume input exists
                    st = new StringTokenizer(br.readLine());
//                    Utility-safe : EOF handling also
//                    String line = br.readLine();
//                    if (line == null) return null; //escape EOF
//                    st = new StringTokenizer(line);
                }catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() {return Double.parseDouble(next());}
        String nextLine() {
            try { return br.readLine(); }
            catch(IOException e) { throw new RuntimeException(e); }
        }
        boolean nextBoolean(){return Boolean.parseBoolean(next());}
        char nextChar(){ return next().charAt(0); }
    }
}
/*
3. User-defined FastReader Class (which uses bufferedReader and StringTokenizer):
This method uses the time advantage of BufferedReader and StringTokenizer and the advantage of
user-defined methods for less typing and therefore a faster input altogether.
These get accepted with a time of 1.23 s and this method is very much recommended as,
it is easy to remember and is fast enough to meet the needs of most of the question in competitive coding.
*/