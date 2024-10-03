package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int any;
        System.out.println("Dime l'any que vulgues");
        any = scanner.nextInt();
        scanner.close();
        if(any%400==0 || any%4==0) {
            System.out.println(any+" es un any bisisesto");
        }else{
            System.out.println(any+" no es un any bisisesto");
        }
    }
}
