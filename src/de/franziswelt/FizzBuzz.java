package de.franziswelt;

public class FizzBuzz {
    public static void main(String[] args) {// mit dieser Zeile wird das Programm ausführbar; static nicht objektbasiert
        // void: Ausgabewert keiner
        FizzBuzzPrinter printer=new FizzBuzzSimplePrinter();
        int schleifenEnde = 50;
        for (int i = 1; i <= schleifenEnde; i++) {
            printer.printFizzBuzz(i);
        }

    }


}

interface FizzBuzzPrinter {
    void printFizzBuzz(int number);
}

