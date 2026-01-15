package Java_Language.Basics;

class StringAndBooleanLiteral {
    public static void main(String[] args) {
        //Any sequence of characters within double quotes is treated as String literals.
        //String literals may not contain unescaped newline or linefeed characters.
        //However, the Java compiler will evaluate compile-time expressions,
        //so the following String expression results in a string with three lines of text.
        // i.e. String literals cannot contain raw newlines.
        //->Escape sequences (\n) must be used for line breaks.
        //->Compile-time string concatenation (+) merges multiple literals into one String.
        //->The compiler combines the parts into a single String containing multiple lines.
        String text = "This is a String literal\n"
                + "which spans not one and not two\n"
                + "but three lines of text.\n";
        System.out.println(text);

        //Only two values are allowed for Boolean literals, i.e., true and false.
        boolean b = true;
        boolean c = false;
    }
}
