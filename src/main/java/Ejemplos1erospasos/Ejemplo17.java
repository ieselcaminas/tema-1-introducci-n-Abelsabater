package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int mes;

        System.out.println("Dona'm el numero del mes ");

        mes=scanner.nextInt();

        scanner.close();

        switch(mes){
            case 1:
                System.out.println("Gener te 31 dies");
                break;
            case 2:
                System.out.println("Febrer te 28 dies");
                break;
            case 3:
                System.out.println("Març te 31 dies");
                break;
            case 4:
                System.out.println("Abril te 30 dies");
                break;
            case 5:
                System.out.println("Maig te 31 dies");
                break;
            case 6:
                System.out.println("Juny te 31 dies");
                break;
            case 7:
                System.out.println("Juliol te 31 dies");
                break;
            case 8:
                System.out.println("Agost te 31 dies");
                break;
            case 9:
                System.out.println("Septembre te 30 dies");
                break;
            case 10:
                System.out.println("Octubre te 31 dies");
                break;
            case 11:
                System.out.println("Novembre te 31 dies");
                break;
            case 12:
                System.out.println("Decembre te 31 dies");
                break;
        }
    }
}
