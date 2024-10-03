package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int edad;

        System.out.println("Edad de la persona");

        edad=scanner.nextInt();

        scanner.close();

        if(edad>=18){
            System.out.println("Tens la edad legal");
        }
    }
}
