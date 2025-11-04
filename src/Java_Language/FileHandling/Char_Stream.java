package Java_Language.FileHandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Char_Stream {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("D:\\Practice\\input.txt");
            out = new FileWriter("D:\\Practice\\output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("Successfully read and wrote the text files.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing Streams: Always close streams to avoid resource leaks.
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
