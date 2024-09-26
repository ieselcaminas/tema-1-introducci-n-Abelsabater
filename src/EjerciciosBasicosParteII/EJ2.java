package EjerciciosBasicosParteII;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        double num2;
        System.out.println("Posa un numero");
        num = sc.nextDouble();
        System.out.println("Posa un altre");
        num2 = sc.nextDouble();
        if(0<num && 0<num2 && num<1 && num2<1 ){
            System.out.println("Estan entre 0 i 1");
        } else {
            System.out.println("falso");
        }
    }
}
