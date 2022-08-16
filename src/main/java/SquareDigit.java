public class SquareDigit {

    public int squareDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        String result = "";
        for (char c : chars) {
            result = result.concat(String.valueOf((int) Math.pow(Double.parseDouble(String.valueOf(c)), 2)));
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        SquareDigit squareDigit = new SquareDigit();
        int test = squareDigit.squareDigits(9119);
        System.out.println(test);
    }
}
