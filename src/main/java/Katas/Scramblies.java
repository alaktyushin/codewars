package Katas;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        char[] a2 = str2.toCharArray();
        for (char i : a2) {
            if (!str1.contains(String.valueOf(i))) {
                return false;
            }
            str1 = str1.replaceFirst(String.valueOf(i), "");
        }
        return true;
    }
}
