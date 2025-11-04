package Java_Language.FileHandling;
import java.io.File;
import java.io.IOException;
//To create a file in a specific directory (requires permission), specify the path
// of the file and use double backslashes to escape the "\" character (for Windows).
// On Mac and Linux you can just write the path, like: /Users/name/filename.txt
//EXAMPLE :
//File myObj = new File("C:\\Users\\MyName\\filename.txt");
class CreateFile {
    public static void main(String[] args) {
        try {
            //File obj = new File("D:\\Practice\\TextFile.txt");
            File obj2 = new File("D:\\Practice\\Img.jpeg");
            //✅ Platform-independent path (recommended)
            File obj = new File("D:" + File.separator +"Practice"+File.separator+ "TextFile.txt");
            if (obj.createNewFile())
                System.out.println("File Created : "+obj.getName());
            else System.out.println(obj.getName()+" already exists.");
            if(obj2.createNewFile())
                System.out.println("File Created : "+obj2.getName());
            else System.out.println(obj2.getName()+" already exists.");
        } catch (IOException e) {
            System.out.print("An IOException caught.");
        }
    }
}

