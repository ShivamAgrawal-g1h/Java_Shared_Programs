package Java_Language.Basics;

class CharLiteral {
    public static void main(String[] args) {
        //1 Single quote: We can specify literal to a char data type as a single character within the single quote.
        char ch = 'a';
        System.out.println(ch);
        //2. Char literal as Integral literal: we can specify char literal as integral literal,
        // which represents the Unicode value of the character, and that integral literal can be specified
        // either in Decimal, Octal, and Hexadecimal forms. But the allowed range is 0 to 65535.
        char ch2 = 0141;  // Octal literal representing character with Unicode code 97 (which is 'a')
        System.out.println(ch2);
        //3. Unicode Representation: We can specify char literals in Unicode representation
        // ‘\\uxxxx’. Here xxxx represents 4 hexadecimal numbers.
        char ch3 = '\u0061';// Here /u0061 represent a.
        System.out.println(ch3);
        //4. Escape Sequence: Every escape character can be specified as char literals.
        char ch4 = '\n';
        System.out.println(ch4);


    }
}
