package Java_Language.FileHandling;
import java.io.File;
class Deleting {
    public static void main(String[] args) {
        File obj = new File("D:\\Practice\\TextFile.txt");
        // Deleting File
        if (obj.delete()) {
            System.out.println("The deleted file is : " + obj.getName());
        }
        else // such as No delete permission or File does not exist ,etc.
            System.out.println("File deletion failed.");

    }
}
