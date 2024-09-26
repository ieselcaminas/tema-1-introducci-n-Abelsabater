package EjerciciosBasicosParteII;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        int num3;
        int num4;
        System.out.println("Posa un numero");
        num = sc.nextInt();
        System.out.println("Posa un altre");
        num2 = sc.nextInt();
        System.out.println("Posa un altre");
        num3 = sc.nextInt();
        System.out.println("Posa un altre");
        num4 = sc.nextInt();
        if(num == num2 && num == num3 && num == num4){
            System.out.println("Son iguals");
        } else{
            System.out.println("Falso");
        }
    }
}
