package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int x;

        int y;

        System.out.println("Dona'm un numero");

        x=scanner.nextInt();

        System.out.println("Dona'm un altre numero");

        y=scanner.nextInt();

        scanner.close();

        if(x>=y){
            System.out.println(y+","+x);
        }else{
            System.out.println(x+","+y);
        }

    }
}
