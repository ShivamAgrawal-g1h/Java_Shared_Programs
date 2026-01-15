package Java_Language.InputOutput;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
class FastIO2 {
    public static void main(String[] args)   throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        // --- 1. ROBUST INPUT for N and K ---
        while (!st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return; // Stop if EOF
            st = new StringTokenizer(line);
        }
        int n = Integer.parseInt(st.nextToken());
        while (!st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return;
            st = new StringTokenizer(line);
        }
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        while (n-- > 0) {
            while(!st.hasMoreTokens()){
                String line = br.readLine();
                // FIX 2: Check for null inside the loop to prevent crash
                if (line == null) break; // Escape the EOF
                st = new StringTokenizer(line);
            }
            if (!st.hasMoreTokens())
                break; // Stop the MAIN loop (n-- loop) immediately
            int x = Integer.parseInt(st.nextToken());
            if (x % k == 0)
                count++;
        }
        // instead of System.out.println(count);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));// write number as String
        bw.newLine();
        bw.flush();// CRITICAL Step(very important)
    }
}
/*
            BufferedReader  (fast, but verbose):
The java.io.BufferedReader class reads text from a character-input stream,
buffering characters to provide efficient reading of characters, arrays, and lines.
With this way, we will have to parse the value every time for the desired type.
Reading multiple words from a single line as input adds to its complexity, because of the use of
Stringtokenizer and hence this is not recommended.
These get accepted with a running time lesser but still as you can see it requires a lot of
typing altogether and therefore method 3 is recommended.


In Java, out.close() is generally sufficient and best practice because it automatically calls out.flush()
first to write any buffered data before releasing system resources, but out.flush() is used explicitly for
immediate data visibility (like console prompts) or ensuring data is written before an expected stop,
preventing loss if the program crashes before close() is called.
Key takeaway
-->flush(): Writes buffer to destination, keeps stream open.
-->close(): Flushes buffer and closes stream (releases resources).
*/