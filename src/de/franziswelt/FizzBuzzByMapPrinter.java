package de.franziswelt;

import java.util.HashMap;
import java.util.Map;

class FizzBuzzByMapPrinter implements FizzBuzzPrinter {
    @Override
    public void printFizzBuzz(int number) {
        Map<Integer, String> map = new HashMap();
        map.put(0, "FizzBuzz");
        map.put(3, "Fizz");
        map.put(6, "Fizz");
        map.put(9, "Fizz");
        map.put(12, "Fizz");
        map.put(5, "Buzz");
        map.put(10, "Buzz");
        int key = number % 15;
        String value = map.get(key);
        if (value == null) {             // value: der wert der zu dem key "i" gefunden wurde, wenn der in den mapeinträgen
            // nicht gelistet ist, dann folgt ...
            System.out.println(number);

        } else {
            System.out.println(value);
        }
    }
}
