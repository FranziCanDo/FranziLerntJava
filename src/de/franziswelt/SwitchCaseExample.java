package de.franziswelt;

public class SwitchCaseExample {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            String word;
            switch (i) {
                case 0:
                    System.out.println("na");
                case 1:
                    System.out.println("Sie");break;
                case 2:
                    System.out.println("toller");
                case 3:
                    System.out.println("Hecht");
                case 4:
                    System.out.println("Frosch");
                default:
                    System.out.println("!");
            }

        }
    }
}
