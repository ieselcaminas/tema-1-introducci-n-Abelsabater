package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal;
        System.out.println("Posa un numero decimal");
        decimal=sc.nextInt();
        String binari=""+""+""+""+""+""+""+"";
        if(decimal%2!=1){
            binari="0"+"0"+"0"+"0"+"0"+"0"+"0"+1;
        }
        if(decimal%2==0){
            binari="0"+"0"+"0"+"0"+"0"+"0"+1+"0";
        }
        if(decimal%4==0){
            binari="0"+"0"+"0"+"0"+"0"+1+"0"+"0";
        }
    }
}
