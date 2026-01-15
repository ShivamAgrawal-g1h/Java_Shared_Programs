package Java_Language.Operators;
class Instance_of_operator {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str instanceof String);
        Object obj = Integer.valueOf(10);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}
