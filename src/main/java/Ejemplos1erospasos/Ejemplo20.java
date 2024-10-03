package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preuconcert;
        System.out.println("Dime el preu del concert al que vas");
        preuconcert = scanner.nextDouble();
        scanner.close();
        if(6>preuconcert){
            System.out.println("No se t'aplica ningun descompte");

        } else if (6<=preuconcert && preuconcert<60) {
            System.out.println("Tens descomptre del 5% per tant l'entra te costa "+(preuconcert-(preuconcert*5/100)));
        }else if ( preuconcert>=60) {
            System.out.println("Tens descomptre del 10% per tant l'entra te costa "+(preuconcert-(preuconcert*10/100)));
        }

    }
}
