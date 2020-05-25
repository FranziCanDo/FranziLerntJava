package de.franziswelt;

class FizzBuzzParameterizedPrinter implements FizzBuzzPrinter {
    public void printFizzBuzz(int i) {
        if (isDevidableBy(i, 3)) System.out.print("Fizz");
        if (isDevidableBy(i, 5)) System.out.print("Buzz");
        if (!isDevidableBy(i, 3) && !isDevidableBy(i, 5)) System.out.print(i);
        System.out.println();
    }

    private boolean isDevidableBy(int i, int divisor) {
        return i % divisor == 0;
    }
}
