package Ejemplos1erospasos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal=0;
        int suma;
        char bit;
        int pot;
        String bi;
        System.out.println("Posa un numero binari");
        bi=sc.nextLine();
        for (int i = 0; i <bi.length(); i++) {
            bit= (char) (bi.charAt(i)-48);
            pot= (int) Math.pow(2,(bi.length()-i-1));
            suma=bit*pot;
            decimal+=suma;
        }
        System.out.println(decimal);
    }
}
