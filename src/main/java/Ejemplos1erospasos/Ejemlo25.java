package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemlo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial=1;
        int X;
        System.out.println("Dime un numero");
        X = sc.nextInt();
        sc.close();
        for (int i = 1; i <= X; i++) {
            factorial*=i;

        }
        System.out.println(factorial);
    }
}