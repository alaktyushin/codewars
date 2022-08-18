package Katas;

import java.math.BigInteger;

public class LastDigitOfLargeNumber {

    public static int lastDigit(BigInteger n1, BigInteger n2) {
        if (n1.toString().endsWith("0")) {
            return 0;
        }
        int n;
        if (n2.toString().length() <= 3) {
            n = n2.intValue();
        } else {
            n = Integer.parseInt(n2.toString().substring(n2.toString().length() - 3));
        }
        if (n == 0) {
            return 1;
        }
        n1 = BigInteger.valueOf(Integer.parseInt(n1.toString().substring(n1.toString().length() - 1)));
        n1 = n1.pow(n);
        String res = n1.toString().substring(n1.toString().length() - 1);
        return Integer.parseInt(res);
    }
}
