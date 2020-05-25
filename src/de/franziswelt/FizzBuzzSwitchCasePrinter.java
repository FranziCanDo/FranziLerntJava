package de.franziswelt;

class FizzBuzzSwitchCasePrinter implements FizzBuzzPrinter {
    public void printFizzBuzz(int number) {
        switch (number % 15) {
            case 0:
                System.out.println("FizzBuzz");
                break;
            case 3:
            case 6:
            case 9:
            case 12:
                System.out.println("Fizz");
                break;
            case 5:
            case 10:
                System.out.println("Buzz");
                break;
            default:
                System.out.println(number);

        }
    }
}
