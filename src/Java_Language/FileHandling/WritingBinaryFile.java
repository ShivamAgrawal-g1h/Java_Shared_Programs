package Java_Language.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class WritingBinaryFile {
    public static void main(String[] args) {
        try(FileInputStream src = new FileInputStream("D:\\Practice\\SourceImage.png");
            FileOutputStream dest = new FileOutputStream("D:\\Practice\\Img.jpeg")){
            int b;
            while((b=src.read())!=-1){
                dest.write(b);
            }
            System.out.println("Image is ready!");
        } catch (IOException e) {
            System.out.println("IOException caught.");
        }
    }
}
