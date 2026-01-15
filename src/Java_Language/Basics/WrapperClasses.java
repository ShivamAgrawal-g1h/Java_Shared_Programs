package Java_Language.Basics;
class WrapperClasses {
    public static void main(String[] args){
        // byte data type
        byte a = 1;
        // wrapping around Byte object (use valueOf or autoboxing)
        Byte byteobj = a;//  (OR)  Byte byteobj = Byte.valueOf(a);

        // int data type
        int b = 10;
        // wrapping around Integer object (use valueOf or autoboxing)
        Integer intobj = b;// (OR) Integer intobj = Integer.valueOf(b);

        // float data type
        float c = 18.6f;
        // wrapping around Float object (use valueOf or autoboxing)
        Float floatobj = c;// (OR) Float floatobj = Float.valueOf(c);

        // double data type
        double d = 250.5;
        // Wrapping around Double object (use valueOf or autoboxing)
        Double doubleobj = d;// (OR) Double doubleobj = Double.valueOf(d);

        // char data type
        char e = 'a';
        // wrapping around Character object (autoboxing)
        Character charobj = e;// (OR) Character charobj = Character.valueOf(e);

        // printing the values from objects
        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("\nByte object byteobj: " + byteobj);
        System.out.println("\nInteger object intobj: " + intobj);
        System.out.println("\nFloat object floatobj: " + floatobj);
        System.out.println("\nDouble object doubleobj: " + doubleobj);
        System.out.println("\nCharacter object charobj: " + charobj);

        // objects to data types unwrapping objects to primitive datatypes
        byte bv = byteobj; // internally byte bv = byteobj.byteValue();
        int iv = intobj; // internally int iv = intobj.intValue();
        float fv = floatobj; // similar to above.....
        double dv = doubleobj;// ...
        char cv = charobj;// ...

        // printing the values from data types
        System.out.println("\nUnwrapped values (printing as data types)");
        System.out.println("\nbyte value, bv: " + bv);
        System.out.println("\nint value, iv: " + iv);
        System.out.println("\nfloat value, fv: " + fv);
        System.out.println("\ndouble value, dv: " + dv);
        System.out.println("\nchar value, cv: " + cv);
    }
}
