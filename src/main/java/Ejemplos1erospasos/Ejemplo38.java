package Ejemplos1erospasos;

import java.util.Random;
import java.util.Scanner;

public class Ejemplo38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        int num= ra.nextInt(100);
        int num2;

        do{
            System.out.println("Dime un numero");
            num2= sc.nextInt();
            if(num2>num){
                System.out.println("Mes menut");
            }else if (num2<num){
                System.out.println("Mes gran");
            }
        }while(num2!=num);
        System.out.println("Has guanyat el numero era "+num);
    }
}