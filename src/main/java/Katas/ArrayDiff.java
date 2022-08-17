package Katas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> aaa = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bbb = Arrays.stream(b).boxed().collect(Collectors.toList());
        aaa.removeAll(bbb);
        int[] result = new int[aaa.size()];
        for (int i = 0; i < aaa.size(); i++) {
            result[i] = Integer.parseInt(String.valueOf(aaa.get(i)));
        }
        return result;
    }
}