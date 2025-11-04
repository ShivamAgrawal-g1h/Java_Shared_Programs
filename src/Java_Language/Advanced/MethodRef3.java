package Java_Language.Advanced;

import java.util.Arrays;

class MethodRef3 {
    public static void main(String[] args) {
        String[] a = {"GFG","IDE","Courses"};
        String[] b = {"gfg","ide","courses"};
        System.out.println(Arrays.equals(a,b,String::compareToIgnoreCase));
        System.out.println(Arrays.equals(a,b,(x1,x2)->x1.compareToIgnoreCase(x2)));
    }
}
