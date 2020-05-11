package de.franziswelt;

public class RomanNumberRenderer {

    public static void main(String[] args) {
        for (int number = 100; number > 0; number--) {
            String romanNumber = renderRomanNumber(number);
            System.out.println(number + " is " + romanNumber);
        }
    }

    private static String renderRomanNumber(int number) {

        StringBuilder result = new StringBuilder();  //fette blaue systemische Begriffe = keywords, Java sind die keywords,
        // Rechenzeichen, Semikolon etc. und
        int rest = number;
        while (rest > 0) {
            if (rest >= 100) rest = subtractRomanLetter(result, rest, 100, "C");
            else if (rest >= 50) rest = subtractRomanLetter(result, rest, 50, "L");
            else if (rest >= 10) rest = subtractRomanLetter(result, rest, 10, "X");
            else if (rest >= 5) rest = subtractRomanLetter(result, rest, 5, "V");
            else rest = subtractRomanLetter(result, rest, 1, "I");
        }

        
        return result.toString().replaceFirst("XXXX", "XL");
        // renderRomanNumber ist eine Funktion (number rein string raus) und
        // eine Methode (weil es einer Klasse zugeordnet ist)
    }

    private static int subtractRomanLetter(StringBuilder result, int rest, int i, String l) {
        rest = rest - i;
        result.append(l);
        return rest;
    }

}
