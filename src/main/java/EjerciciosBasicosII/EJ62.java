package EjerciciosBasicosII;

import java.util.Scanner;

public class EJ62 {
    public static void main (String []args){
        int num1;
        int num2;
        int num3;
        int resta1;
        int resta2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        num1= sc.nextInt();
        System.out.println("Dime un altre");
        num2= sc.nextInt();
        System.out.println("Dime un altre");
        num3= sc.nextInt();
        if(num1>=num2 && num1>=num3){
            resta1=num1-num2;
            resta2=num1-num3;
            if(resta1>=20 || resta2>=20){
                System.out.println("Es veritat");
            }
        } else if (num2>=num1 && num2>=num3) {
            resta1=num2-num1;
            resta2=num2-num3;
            if(resta1>=20 || resta2>=20){
                System.out.println("Es veritat");
            }
        } else{
            resta1=num3-num1;
            resta2=num3-num2;
            if(resta1>=20 || resta2>=20){
                System.out.println("Es veritat");
            }
        }
    }
}