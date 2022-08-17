package Katas;

public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> names[0].concat(" likes this");
            case 2 -> names[0].concat(" and ").concat(names[1].concat(" like this"));
            case 3 -> names[0].concat(", ").concat(names[1]).concat(" and ").concat(names[2].concat(" like this"));
            default ->
                    names[0].concat(", ").concat(names[1]).concat(" and ").concat(String.valueOf(names.length - 2)).concat(" others like this");
        };
    }
}
