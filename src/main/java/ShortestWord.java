import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).min(Comparator.comparing(String::length)).get().length();
    }
}