package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double x;
        double y;
        System.out.println("Dona'm un numero");
        x=scanner.nextInt();
        System.out.println("Dona'm un altre");
        y=scanner.nextInt();
        double suma= x+y;
        double resta= x-y;
        double multi= x*y;
        double divi= x/y;
        scanner.close();
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacio es "+multi);
        System.out.println("La divisio es "+divi);
    }
}
