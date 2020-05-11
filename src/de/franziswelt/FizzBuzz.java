package de.franziswelt;

public class FizzBuzz {
    public static void main(String[] args) {// mit dieser Zeile wird das Programm ausführbar; static nicht objektbasiert
        // void: Ausgabewert keiner
        int schleifenEnde = 50;
        for (int i = 1; i <= schleifenEnde; i++) {
            printFizzBuzzSwitchCase(i);
        }

    }

    private static void printFizzBuzzVerbose(int i) {
        if (i % 3 == 0 && i % 5 != 0) System.out.println("Fizz");
        if (i % 5 == 0 && i % 3 != 0) System.out.println("Buzz");
        if (i % 3 != 0 && i % 5 != 0) System.out.println(i);
        if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
    }

    private static void printFizzBuzz(int i) {
        if (isDevidableBy3(i)) System.out.print("Fizz");
        if (isDevidableBy5(i)) System.out.print("Buzz");
        if (!isDevidableBy3(i) && !isDevidableBy5(i)) System.out.print(i);
        System.out.println();
    }

    private static void printFizzBuzzParameterized(int i) {
        if (isDevidableBy(i, 3)) System.out.print("Fizz");
        if (isDevidableBy(i, 5)) System.out.print("Buzz");
        if (!isDevidableBy(i, 3) && !isDevidableBy(i, 5)) System.out.print(i);
        System.out.println();
    }

    private static boolean isDevidableBy(int i, int divisor) {
        return i % divisor == 0;
    }

    private static boolean isDevidableBy5(int i) {
        return i % 5 == 0;
    }

    private static boolean isDevidableBy3(int i) {
        return i % 3 == 0;
    }

    private static void printFizzBuzzSwitchCase(int i) {

    }

    private static int doSomethingUseless() {
        int result = 0;
        int number = 1;
        switch (number) {
            case 1:
                result = 17; break;
            case 2:
            case 3:
                result = 42; break;
            default:
                result = 399;
        }
        return  result;
    }

}
