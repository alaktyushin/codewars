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

    public static void main(String[] args) {
        System.out.println(Scramblies.scramble("rkqodlw","world"));
        System.out.println(Scramblies.scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(Scramblies.scramble("katas","steak"));
        System.out.println(Scramblies.scramble("scriptjavx","javascript"));
        System.out.println(Scramblies.scramble("scriptingjava","javascript"));
        System.out.println(Scramblies.scramble("scriptsjava","javascripts"));
        System.out.println(Scramblies.scramble("javscripts","javascript"));
        System.out.println(Scramblies.scramble("aabbcamaomsccdd","commas"));
        System.out.println(Scramblies.scramble("commas","commas"));
        System.out.println(Scramblies.scramble("sammoc","commas"));
    }
}
