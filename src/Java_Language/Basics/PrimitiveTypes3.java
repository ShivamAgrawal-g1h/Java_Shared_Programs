package Java_Language.Basics;

class PrimitiveTypes3 {
    public static void main(String[] args) {
        float value1 = 9.87f; // 4 byte size
        System.out.println(value1);
        double value2 = 9.87; // 8 byte size
        System.out.println(value2);
        if(value1==value2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        char ch = '%'; // 2byte size
        System.out.println(ch);
    }
}
