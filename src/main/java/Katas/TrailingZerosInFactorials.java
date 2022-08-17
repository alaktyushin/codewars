package Katas;

import java.math.BigInteger;

public class TrailingZerosInFactorials {

    public static BigInteger trailingZeros(BigInteger num, BigInteger base) {
        System.out.println("num:");
        System.out.println(num);
        System.out.println("base:");
        System.out.println(base);
        BigInteger factorial = getFactorial(num);
        System.out.println(factorial);
        String resultString = baseConversion(factorial.toString(), 10, base.intValue());
        System.out.println(resultString);
        int zeros = 0;
        for (var c : resultString.toCharArray()) {
            if (!String.valueOf(c).equals("0")) {
                zeros = 0;
            } else zeros++;
        }
        return BigInteger.valueOf(zeros);
    }

    public static String baseConversion(String number, int sBase, int dBase) {
        return Long.toString(Long.parseLong(number, sBase), dBase);
    }

    public static BigInteger getFactorial(BigInteger num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num.longValue(); i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        String number = "17552";
        //String number = "14239573441981817552";
        BigInteger bigInteger = new BigInteger(number);
        //System.out.println(bigInteger);
        //System.out.println(BigInteger.valueOf(14 239 573 441 981 817 552));
        //BigInteger bigInteger = 14239573441981817552;
        //System.out.println(baseConversion("1234567890123456789", 10, 16));
        //System.out.println(getFactorial(14239573441981817552));
        System.out.println(baseConversion(bigInteger.toString(), 10, 2));
        //System.out.println(trailingZeros(bigInteger, BigInteger.valueOf(361604041)));
    }
}
