package Java_Language.FileHandling;
import java.io.FileWriter;
import java.io.IOException;
class WritingTextFile {
    public static void main(String[] args){
        try{
            FileWriter w = new FileWriter("D:\\Practice\\TextFile.txt");
            //Opens the file in overwrite mode
            //If file does not exist → it creates it
            //If file exists → content is erased ❗

            //✅ To Use append mode if you don’t want to overwrite
            //FileWriter w = new FileWriter("D:\\Practice\\File.txt", true);
            //true → append, Note: If the file does not already exist, Java will create it before appending.
            //false (default) → overwrite

            w.write("File Handling in Java might be tricky, but it is fun enough!\nJava provides excellent data security");
            // Writes characters to the file buffer

            // Close the writer,VERY IMPORTANT,to ensure the data is saved and the resources are released.
            w.close();
            //Flushes buffer → writes data to disk
            //Releases OS resources
            //✔️ Without close(), data may not be written
            System.out.println("Successfully wrote to the file.");
        }catch(IOException ex) { // such as the file being not writable
            System.out.println("An IOException caught.");
            ex.printStackTrace();
        }
        /**     Since Java 7, you can use try-with-resources
         *     // FileWriter will be closed automatically here
         *     try (FileWriter w = new FileWriter("FileText.txt")) {
         *       w.write("File Handling in Java might be tricky, but it is fun enough!\nJava provides excellent data security");
         *       System.out.println("Successfully wrote to the file.");
         *     } catch (IOException e) {
         *       System.out.println("An error occurred.");
         *       e.printStackTrace();
         *     }
         */
        /**
         * FileWriter - easiest choice for basic text.
         * BufferedWriter - better for large text files, because it is faster and supports handy features.
         * FileOutputStream - best for binary data (images, audio, PDFs)
         *
         */
    }
}
