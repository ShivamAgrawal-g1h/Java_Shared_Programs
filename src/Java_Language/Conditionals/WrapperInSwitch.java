package Java_Language.Conditionals;

class WrapperInSwitch {
    public static void main(String[] args) {
        Integer age = 25;
        //Java allows the use of wrapper classes (Integer, Short, Byte, Long, and Character)
        // in switch statements. This provides flexibility
        //when dealing with primitive data types and their corresponding wrapper types.
        switch (age) { // Extract primitive value for switch
            case 25:
                System.out.println("You are 25.");
                break;
            case 30:
                System.out.println("You are 30.");
                break;
            default:
                System.out.println("Age not matched.");
        }


        Character ch = 'c';
        switch (ch) { // Extract primitive value for switch
            case 'a':
                System.out.println("You are a.");
                break;
            case 'c':
                System.out.println("You are c.");
                break;
            default:
                System.out.println("Character not matched.");
        }
    }
}
