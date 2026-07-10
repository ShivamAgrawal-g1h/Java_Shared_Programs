package Library.ArraysClass;

import java.util.Arrays;

class MismatchMethod {
    static void main() {
        int[] a = {10,20,30};
        int[] b = {10,20,30};
        int[] c = {10,20,40,30};
        System.out.println(Arrays.mismatch(a,b));
        System.out.println(Arrays.mismatch(a,c));
        System.out.println(Arrays.mismatch(a,0,2,c,0,2));

        String[] a2 = {"GeeksforGeeks","IDE"};
        String[] b2 = {"geeksforgeeks","Courses"};
        System.out.println(Arrays.mismatch(a2,b2,String::compareToIgnoreCase));

    }
}
