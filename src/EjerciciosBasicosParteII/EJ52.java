package EjerciciosBasicosParteII;

import java.util.Scanner;

public class EJ52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        int num3;
        System.out.print("Posa un numero: ");
        num = sc.nextInt();
        System.out.print("Posa un altre: ");
        num2 = sc.nextInt();
        System.out.print("Posa un altre: ");
        num3 = sc.nextInt();
        if(num+num2==num3){
            System.out.println("La resposta esta correcta");
        }
    }
}
