package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int x;

        System.out.println("Dona'm la nota");

        x=scanner.nextInt();

        scanner.close();

        if(0<=x && x<3){
            System.out.println("Molt deficient");
        }else if(3<=x && x<5){
            System.out.println("Deficient");
        }else if(5<=x && x<6){
            System.out.println("Suficient");
        }else if(6<=x && x<7){
            System.out.println("Be");
        }else if(7<=x && x<9){
            System.out.println("Notable");
        }else if(9<=x && x<10){
            System.out.println("Excel·lent");
        }
    }
}
