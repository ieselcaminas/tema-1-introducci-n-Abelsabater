package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos=0;
        int X;
        System.out.println("Dime quants numeros vols");
        X = sc.nextInt();
        for (int i = 0; i < X; i++) {
            int Y;
            System.out.println("Dime un numero");
            Y = sc.nextInt();
            if(Y>0){
                positivos++;
            }
        }
        System.out.println(positivos);
    }
}