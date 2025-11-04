package Java_Language.Advanced;
class Q11_CountWordsInString {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        // \\s+ means "one or more spaces"
        // trim() removes spaces from the very start and end
        String[] words = str.trim().split("\\s+");
        return words.length;

        //Method-2
        /*
        int count = 0;
        boolean isWord = false; // State flag
        int n = str.length();

        for (int i = 0; i < n; i++) {
            // Check specific character efficiently
            char ch = str.charAt(i);

            // If current char is NOT a space...
            if (ch != ' ') {
                // ...and we were NOT in a word previously, this is a new word.
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                // If we hit a space, we are no longer in a word
                isWord = false;
            }
        }
        return count;
         */
    }
    public static void main(String[] args) {
        String s = " Java  Programs   ";
        System.out.println("No. of words are : "+countWords(s));
    }
}
