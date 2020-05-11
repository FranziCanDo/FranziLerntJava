package de.franziswelt;

public class CommandLineExample {
    public static void main(String[] commandLineArguments) {
        for (int i = 0 ; i < commandLineArguments.length ; i++) {
            System.out.println("Command line argument " + i + " is " + commandLineArguments[i]);
        }
    }
}
