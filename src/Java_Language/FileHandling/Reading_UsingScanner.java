package Java_Language.FileHandling;
// Reading a file
/*
Reading data from a file can be achieved using various methods, one
of which is the Scanner class. The Scanner class is versatile and can read different
types of data, including strings, integers, and more, from files.
Scanner is NOT a stream class.
It is a high-level parsing utility built on top of streams/readers.

True character streams:
FileReader
BufferedReader
InputStreamReader (bridge between byte → char) 📌 InputStreamReader is fundamental (bridge class).
InputStreamReader is a bridge class that converts byte streams into character streams by decoding
bytes using a character encoding.
EXAMPLE : BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
(BufferedReader expects a Reader being in character stream BUT, System.in is an InputStream)
System.in (bytes)
   ↓
InputStreamReader (decode bytes → chars)
   ↓
BufferedReader (buffer + readLine())



Scanner - best for simple text and when you want to parse numbers or words easily.
FileReader
BufferedReader - best for large text files, because it is faster and reads line by line.
FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class Reading_UsingScanner {
    public static void main(String[] args) {
        try{
            //Specify the path
            File obj=new File("D:\\Practice\\TextFile.txt");
            if (!obj.exists()) {
                System.out.println("File does not exist.");
                return;
            }
            else{ // getting file info(metadata) and then file content
                Scanner r = new Scanner(obj);
                System.out.println(obj.getName());
                System.out.println(obj.getAbsolutePath());
                System.out.println(obj.canWrite());
                System.out.println(obj.canRead());
                System.out.println(obj.length()); // length in bytes
                while (r.hasNextLine()) {
                    String data = r.nextLine();
                    System.out.println(data);
                }
                r.close();
            }
        }
        catch (IOException e){
            System.out.println("An IOException caught.");
        }
        /**
         *
         // try-with-resources: Scanner will be closed automatically
         try (Scanner r = new Scanner(obj)) {
            while (r.hasNextLine()) {
            String data = r.nextLine();
            System.out.println(data);
            }
         } catch (FileNotFoundException e) { // such as file being not readable
            System.out.println("An IOException caught.");
            e.printStackTrace();
         }
         */
    }
}
