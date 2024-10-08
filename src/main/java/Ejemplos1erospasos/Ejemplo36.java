package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal;
        int bi;
        System.out.println("Posa un numero decimal");
        decimal=sc.nextInt();
        String binari=""+"";
        do{
            bi=decimal%2;
            binari+=bi;
            decimal=decimal/2;
        }while(decimal>1);
        System.out.println(binari);
    }
}
