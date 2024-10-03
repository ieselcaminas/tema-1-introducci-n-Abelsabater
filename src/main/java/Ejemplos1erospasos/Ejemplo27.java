package Ejemplos1erospasos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo27 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int X;
        System.out.println("Posa'm un numero");
        X = sc.nextInt();
        sc.close();
        for (int i = 1; i <= X; i++) {
            lista.add(i);
            System.out.println(lista);
        }
    }
}
