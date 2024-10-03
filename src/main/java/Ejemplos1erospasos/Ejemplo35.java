package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        int resta;
        int resta2=0;
        System.out.print("Posa un numero: ");
        num=sc.nextInt();
        System.out.print("Posa un altre: ");
        num2=sc.nextInt();
        do{
            resta2+=num2;
            resta=num-resta2;
        }while(resta>=num2);
        System.out.println("El resto de "+num+" / "+num2+" es: "+resta);
    }
}
