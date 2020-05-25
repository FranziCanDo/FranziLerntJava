package de.franziswelt;

class FizzBuzzSimplePrinter implements FizzBuzzPrinter {

    public void printFizzBuzz(int i) {
        if (isDevidableBy3(i)) System.out.print("Fizz");
        if (isDevidableBy5(i)) System.out.print("Buzz");
        if (!isDevidableBy3(i) && !isDevidableBy5(i)) System.out.print(i);
        System.out.println();
    }

    private static boolean isDevidableBy5(int i) {
        return i % 5 == 0;
    }

    private static boolean isDevidableBy3(int i) {
        return i % 3 == 0;
    }
}
