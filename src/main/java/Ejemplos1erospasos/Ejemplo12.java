package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int x;

        int y;

        System.out.println("Dona'm un numero");

        x=scanner.nextInt();

        System.out.println("Dona'm un numero");

        y=scanner.nextInt();

        scanner.close();

        if(x>=y){
            System.out.println("El mes gran es el"+x);
        }else{
            System.out.println("El mes gran es el"+y);
        }
    }
}
