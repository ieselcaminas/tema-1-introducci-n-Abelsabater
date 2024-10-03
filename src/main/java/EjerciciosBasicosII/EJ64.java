package EjerciciosBasicosII;

import java.util.Scanner;

public class EJ64 {
    public static void main (String []args){
        int num1;
        int num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un numero");
        num1= sc.nextInt();
        System.out.println("Dime un altre");
        num2= sc.nextInt();
        if(25<num1 || num1<75 && 25<num2 || num2<75 ){
            System.out.println("Es cumpleix la condició");
        }
    }
}
