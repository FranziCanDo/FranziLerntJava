package de.franziswelt;

class FizzBuzzVerbosePrinter implements FizzBuzzPrinter {
     public void printFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 != 0) System.out.println("Fizz");
        if (i % 5 == 0 && i % 3 != 0) System.out.println("Buzz");
        if (i % 3 != 0 && i % 5 != 0) System.out.println(i);
        if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
    }
}
