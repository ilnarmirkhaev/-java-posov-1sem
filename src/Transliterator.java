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
            if (Character.toLowerCase(c) == chars[i]) {
                if (Character.isUpperCase(c))
                    return capitalize(strings[i]);
                return strings[i];
            }
        return Character.toString(c);
    }


    public String translate(String s) {
        char[] symbols = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : symbols)
            result.append(translateOneSymbol(c));
        return result.toString();
    }

    private String capitalize(String s) {
        if (s == null || s.isEmpty())
            return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
