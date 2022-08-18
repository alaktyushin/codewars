package Katas;

public class CarNumberPlateCalculator {

    public static String findTheNumberPlate(int customerID) {
        String result;
        int res = 0;
        for (var s1 = Character.valueOf('a'); s1 <= 'z'; s1++) {
            for (var s2 = Character.valueOf('a'); s2 <= 'z'; s2++) {
                for (var s3 = Character.valueOf('a'); s3 <= 'z'; s3++) {
                    for (var d1 = 1; d1 <= 999; d1++) {
                        if (res == customerID) {
                            result = String.format("%s%s%s%03d", s3, s2, s1, d1);
                            return result;
                        }
                        res++;
                    }
                }
            }
        }
        return null;
    }
}