package Java_Language.InputOutput;

class EscapeSequence {
    public static void main(String[] args) {
        System.out.println("Good MorninG\bg Geeks! ");
        // Output:(The output depends upon compiler)

        //The character \r in Java is an escape sequence representing a carriage return.
        // It is used to move the cursor to the beginning of the current line
        // without advancing to the next line. EXAMPLE USAGE :
        //// Example of a progress indicator
        System.out.print("Loading... 0%\r");
        //// ... some processing ...
        System.out.print("Loading... 50%\r");
        //// ... more processing ...
        System.out.println("Loading complete!");
        System.out.println("Hi \rHello"); // Output:(The output depends upon compiler)

        //In Java, \f is an escape sequence representing the form feed character,
        // which historically instructed printers to advance to a new page.
        //Rarely used in contemporary Java programming, as the practical effect of \f is limited and inconsistent.
        ///1. On many standard development environment consoles, it will likely display as a space,
        ///ignore it, or display a random character.
        ///2. If the output is redirected to a printer that understands the form feed command,
        ///it would physically eject the current page and start a new one.
        System.out.println("Good Morning Geeks! \f How are you all?  ");
        // Output:(The output depends upon compiler)
    }
}
