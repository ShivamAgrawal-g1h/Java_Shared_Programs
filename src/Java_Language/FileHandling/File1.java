package Java_Language.FileHandling;
import java.io.File;
/*
Example 1: Program to check if a file or directory physically exists or not.
 */
class File1 {
    public static void main(String[] args){
        String fname = args[0]; // file name or directory name

        // pass the filename or directory name to File
        // object
        File f = new File(fname);

        // apply File class methods on File object
        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path:" + f.getAbsolutePath());
        System.out.println("Parent:" + f.getParent());
        System.out.println("Exists :" + f.exists());

        if (f.exists()) {
            System.out.println("Is writable:" + f.canWrite());
            System.out.println("Is readable :" + f.canRead());
            System.out.println("Is a directory :" + f.isDirectory());
            System.out.println("File Size in bytes :" + f.length());
        }
    }
}
