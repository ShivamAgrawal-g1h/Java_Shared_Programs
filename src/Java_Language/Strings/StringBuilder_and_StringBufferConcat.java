package Java_Language.Strings;

import java.util.stream.IntStream;

public class StringBuilder_and_StringBufferConcat {
    public static void main(String[] args) {
        // StringBuilder or StringBuffer class
        StringBuilder sb1 = new StringBuilder("geeks");
        // sb2 refers to the same location as sb1
        StringBuilder sb2 = sb1;
        // Append operation modifies the same object
        // as it is mutable in nature
        sb1 = sb1.append("forgeeks");
        // Both sb1 and sb2 refers to the same location
        System.out.println(sb1);
        System.out.println(sb2);
        if(sb1 == sb2)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
