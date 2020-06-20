public class Transliterator {
    // STATIC
    // public
    // private

    // NON-STATIC
    // private fields
    private final char[] chars;
    private final String[] strings;

    // public constructors
    public Transliterator(char[] rus, String[] eng) {
        this.chars = rus;
        this.strings = eng;
    }

    // public methods
    public String translateOneSymbol(char c) {
        for (int i = 0; i < chars.length; i++)
            if (c == chars[i])
                return strings[i];
        return Character.toString(c);
    }


    public String translate(String s) {
        char[] symbols = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : symbols)
            result.append(translateOneSymbol(c));
        return result.toString();
    }

}
