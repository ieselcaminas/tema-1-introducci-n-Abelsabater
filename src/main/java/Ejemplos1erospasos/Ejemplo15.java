package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo15 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int x;

        System.out.println("Dona'm un nombre del 1 al 10");

        x=scanner.nextInt();

        scanner.close();

        switch(x){
            case 1:
                System.out.println("Un");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatre");
                break;
            case 5:
                System.out.println("Cinc");
                break;
            case 6:
                System.out.println("Sis");
                break;
            case 7:
                System.out.println("Set");
                break;
            case 8:
                System.out.println("Huit");
                break;
            case 9:
                System.out.println("Nou");
                break;
            case 10:
                System.out.println("Deu");
                break;
        }
    }
}
