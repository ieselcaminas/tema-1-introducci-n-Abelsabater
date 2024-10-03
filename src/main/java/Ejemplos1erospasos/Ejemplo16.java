package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        String operacio;

        double x;

        double y;

        System.out.println("Dona'm un nombre");

        x=scanner.nextInt();

        System.out.println("Dona'm un altre");

        y=scanner.nextInt();

        System.out.println("Dime l'operacio que vas a fer, +,-,*,/");

        operacio=scanner.next();

        scanner.close();

        switch(operacio){

            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case"/":
                System.out.println(x/y);
                break;
            case "*":
                System.out.println(x*y);
                break;
        }
    }
}
