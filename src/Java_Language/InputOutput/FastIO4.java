package Java_Language.InputOutput;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//Fastest Possible Java I/O.
class FastIO4 {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int k = fs.nextInt();
        int count = 0;
        while (n-- > 0) {
            int x = fs.nextInt();
            if (x % k == 0) count++;
        }
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        out.println(count);
        out.close();//Releases resources ,Flushes automatically
    }
    // Ultra-fast byte-level scanner
    static class FastScanner{
        final private static int BUFFER_SIZE = 1 << 16;//64KB
        final private DataInputStream dis;
        final private byte[] buffer;
        private int bufferPointer, bytesRead;
        public FastScanner(){
            dis = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        // Just for Utility, not required in CP :
        //public FastScanner(String file_name) throws IOException{
        //    dis = new DataInputStream(new FileInputStream(file_name));
        //    buffer = new byte[BUFFER_SIZE];
        //    bufferPointer = bytesRead = 0;
        //}

        // ---------- core byte handling ----------
        private byte read() throws IOException {
            if (bufferPointer >= bytesRead) {
                bytesRead = dis.read(buffer, bufferPointer=0, BUFFER_SIZE);
                if (bytesRead == -1) return -1;//EOF handled
            }
            return buffer[bufferPointer++];
        }
        //-----------------------------------------
        public String readLine() throws IOException{
            StringBuilder sb = new StringBuilder();
            byte c;
            while ((c = read()) != -1 && c != '\n') {
                sb.append((char) c);
            }
            return sb.toString();
        }
        // ---------- numeric readers ----------
        int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' '){
                if(c == -1) return -1;//EOF handled
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) c = read();
            while (c >= '0' && c <= '9') {
                ret = ret * 10 + (c - '0');
                c = read();
            }
            return neg ? -ret : ret;
        }
        long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' '){
                if(c == -1) return -1;//EOF handled
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) c = read();
            while (c >= '0' && c <= '9') {
                ret = ret * 10 + (c - '0');
                c = read();
            }
            return neg ? -ret : ret;
        }
        //--------------------------------------
        //Unsafe :It fails on scientific notation (e.g., 1.2e5),
        // which is common in hard problems. If you need doubles, reading a String token
        // and using Double.parseDouble() is much safer.
//        public double nextDouble() throws IOException {
//            double ret = 0, div = 1;
//            byte c = read();
//            while (c <= ' ')
//                c = read();
//            boolean neg = (c == '-');
//            if (neg)
//                c = read();
//            do {
//                ret = ret * 10 + c - '0';
//            } while ((c = read()) >= '0' && c <= '9');
//            if (c == '.') {
//                while ((c = read()) >= '0' && c <= '9') {
//                    ret += (c - '0') / (div *= 10);
//                }
//            }
//            if (neg)
//                return -ret;
//            return ret;
//        }
        // Use this for doubles (safer than manual parsing)
        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
        // Helper to read strings (needed for nextDouble/next logic)
        public String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            byte c = read();
            while (c <= ' ') {
                if (c == -1) return null;
                c = read();
            }
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }
        //------------------------------------
        void close() throws IOException {dis.close();}
    }
}
