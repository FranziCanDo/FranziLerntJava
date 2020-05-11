package de.franziswelt;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {// mit dieser Zeile wird das Programm ausführbar; static nicht objektbasiert
        // void: Ausgabewert keiner
        int schleifenEnde = 50;
        for (int i = 1; i <= schleifenEnde; i++) {
            printFizzBuzzByMap(i);
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
        switch (i % 15) {
            case 0:
                System.out.println("FizzBuzz");break;
            case 3:
            case 6:
            case 9:
            case 12:
                System.out.println("Fizz");break;
            case 5:
            case 10:
                System.out.println("Buzz");break;
            default:
                System.out.println(i);

        }
    }

    private static void printFizzBuzzByMap(int i){
        Map<Integer, String> map = new HashMap();
        map.put(0, "FizzBuzz");
        map.put(3, "Fizz");
        map.put(6, "Fizz");
        map.put(9, "Fizz");
        map.put(12, "Fizz");
        map.put(5, "Buzz");
        map.put(10, "Buzz");
        int key = i%15;
        String value = map.get(key);
        if(value == null) {             // value: der wert der zu dem key "i" gefunden wurde, wenn der in den mapeinträgen
                                        // nicht gelistet ist, dann folgt ...
            System.out.println(i);

        } else {
            System.out.println(value);
        }
    }

}
