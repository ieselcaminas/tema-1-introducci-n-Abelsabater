package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int radius;

        System.out.println("Dame el radio");

        radius= scanner.nextInt();

        scanner.close();

        double longitud= 2*radius*Math.PI;

        double area= Math.PI*radius*radius;

        System.out.println("L'area es:"+area);

        System.out.println("La longitud es:"+longitud);
    }
}
