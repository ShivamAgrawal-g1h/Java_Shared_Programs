package Java_Language.FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Byte_Stream {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\Practice\\SourceImage.png");
            out = new FileOutputStream("D:\\Practice\\DestImage.png");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("Successfully copied the image.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing Streams: Always close streams to avoid resource leaks.
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
