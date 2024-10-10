package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int segons;

        int minuts;

        int hores;

        int suma=1;
        System.out.println("Dime l'hora que vols");
        hores=scanner.nextInt();
        System.out.println("Dime els minuts vols");
        minuts=scanner.nextInt();
        System.out.println("Dime els segons que vols");
        segons=scanner.nextInt();
        scanner.close();
        segons+=1;
        if(segons>= 60){
            segons-=60;
            minuts+=1;
        }
        if(minuts >= 60){
            minuts-=60;
            hores+=1;
        }
        if(hores >= 24){
            hores=hores-24;
        }
        System.out.println(hores+":"+minuts+":"+segons);
    }
}
