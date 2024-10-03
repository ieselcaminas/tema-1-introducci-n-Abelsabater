package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args){
        float Lado;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Quin es el costat del cuadrat?");
        Lado = scanner.nextFloat();
        scanner.close();
        System.out.println("El area del cuadrado es igual a "+ Lado*Lado);
    }
}
