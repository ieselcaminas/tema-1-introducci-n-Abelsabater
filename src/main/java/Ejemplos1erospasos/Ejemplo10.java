package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        double num;

        System.out.println("Dona'm un numnero");

        num = scanner.nextDouble();

        scanner.close();

        if(num>=0){
            System.out.println(num+ "es positiu");
        }else{
            System.out.println(num+"es negatiu");
        }
    }
}
