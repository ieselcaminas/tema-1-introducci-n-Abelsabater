package EjerciciosBasicosParteII;

import java.util.Scanner;

public class EJ33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma=0;
        int resto=0;
        int operacion=0;
        System.out.println("Posa un numero");
        num = sc.nextInt();
        do{
            resto=num%10;
            suma=suma+resto;
            num=num/10;
        }while(num>0);
        System.out.println("La suma dels digits es: "+suma);
    }
}
