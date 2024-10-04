package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double precio;
        double preciorebajado;
        System.out.println("Introduce el precio");
        precio=scanner.nextDouble();
        System.out.println("Introduce el precio rebajado");
        preciorebajado=scanner.nextDouble();
        scanner.close();
        System.out.println("El descuento es "+ (precio-preciorebajado)/precio*100+"%");
    }
}
