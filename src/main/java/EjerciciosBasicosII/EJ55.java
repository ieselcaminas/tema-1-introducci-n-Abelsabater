package EjerciciosBasicosII;

import java.util.Scanner;

public class EJ55 {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        int num;
        int digito;
        int suma = 0;
        System.out.println("Dime un numero");
        num= sc.nextInt();
        do{
            digito=num%10;
            suma+=digito;
            num=num/10;
        }while(num>0);
        System.out.println("La suma es: "+suma);
    }
}
