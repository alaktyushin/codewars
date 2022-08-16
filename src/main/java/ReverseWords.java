

public class ReverseWords {

    public static String reverseWords(final String original) {
        String[] originals = original.split(" ");
        if (originals.length == 0) {
            return original;
        }
        String result = "";
        for (String subString : originals) {
            char[] chars = subString.toCharArray();
            int i = chars.length - 1;
            while (i >= 0) {
                result = result.concat(String.valueOf(chars[i]));
                i--;
            }
            result = result.concat(" ");
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }
}
