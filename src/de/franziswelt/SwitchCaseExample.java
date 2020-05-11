package de.franziswelt;

public class SwitchCaseExample {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++) {
            String word;
            switch(i) {
                case 0: word = "na";
                case 1: word = "Sie";
                case 2: word = "toller";
                case 3: word = "Hecht";
                case 4: word = "Frosch";
                default:
                    word="!";
            }
            System.out.print(word + " ");
        }
    }
}
