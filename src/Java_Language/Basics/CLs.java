package Java_Language.Basics;
class CLs {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        /// Prints null (Because it's Primordial/Bootstrap!)
        System.out.println(java.sql.SQLException.class.getClassLoader());
        /// Check a class from the SQL package , print PlatformClassLoader
        System.out.println(CLs.class.getClassLoader());
        /// Prints AppClassLoader
    }
}
