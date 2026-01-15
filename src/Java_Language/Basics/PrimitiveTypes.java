package Java_Language.Basics;

class PrimitiveTypes {
    public static void main(String[] args) {
        int age = 37;
        String name = "Sandeep";
        float weight = 70.5f;
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);

        boolean a = false; // JVM dependent size for best performance on a given CPU architecture
        boolean b = true;
        if(b == true)
            System.out.println("Hi Geek ");
        if(a == false)
            System.out.println("Hello Geek");
    }
}
