package de.franziswelt;

public class Main {

    public static void main(String[] args) {
        String namen = "Friedrich";    // die Variablen innerhalb eines Scopes sind außerhalb dessen nicht sichtbar; so wie
        // hier wäre es sichtbar für alle folgenden Scopes innerhalb dieser Funktion main
        for (int i = 1; i < 51; i++) {
			printFizzBuzz(i);
		}
    }
// zwischen Funktionen lässt man Leerzeilen
	//Faustregel: mach keine Funktionen länger als 5 Zeilen
	private static void printFizzBuzz(int number) {
		if (number % 3 == 0)//mit if startet hier die Logik der Schleif, %=modulo teilt durch die angegebene zahl und gibt die Restwerte aus - 0 heißt glatt
			// teilbar, 1 ist Division mit Rest 1,...
			System.out.print("Fizz");
		if (number % 5 == 0)
			System.out.print("Buzz");
		if (number % 3 != 0 && number % 5 != 0)    //i modulo 3 ungleich 0 und i modulo 5 ungleich 0
			System.out.print(number);//ide rückt zeile automatisch ein, wenn eine logische Schachtelung erfolgt
		// (scope nachschlagen)
		System.out.println( );
		// mit Strg Alt L kann man die Formatierung korrigieren lassen
	}
}
