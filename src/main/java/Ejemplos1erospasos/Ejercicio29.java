package Ejemplos1erospasos;

import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa un numero entre 3 i 100");
        int numero = sc.nextInt();
        sc.close();
        if(numero<3 || numero>100) {
            System.out.println("Ha de ser entre 3 i 100");
        }else{
            for (int i = 2; i <= numero+1; i++) {
                if (numero % i == 0 && i != numero ) {
                    System.out.println("No es un numero prim");
                    break;
                }
                if (numero % i != 0 && i>=numero) {
                    System.out.println("Es un numero prim");
                    break;
                }
            }
        }

    }
}
