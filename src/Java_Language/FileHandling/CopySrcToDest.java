package Java_Language.FileHandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopySrcToDest {
    public static void main(String[] args) {
       try(FileReader source = new FileReader("D:\\Practice\\TextFile.txt");
           FileWriter dest = new FileWriter("D:\\Practice\\Dest.txt")){
           int ch;
           while ((ch = source.read()) != -1) {
               dest.write(ch);
           }
           System.out.println("Data copied successfully...");
       }catch(IOException ex){
           System.out.println("IOException caught.");
       }
    }
}
