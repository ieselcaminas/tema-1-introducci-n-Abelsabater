package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int x;

        int y;

        int resposta;

        System.out.println("Dona'm un numero");

        x=scanner.nextInt();

        System.out.println("Dona'm un numero");

        y=scanner.nextInt();

        System.out.println("En quin orden vols que estiga ascendent /1/ o descendent /2/?");

        resposta=scanner.nextInt();

        if(resposta==1){
            if(x>=y){
                System.out.println(y+","+x);
            }else{
                System.out.println(x+","+y);
            }
        }else if(resposta==2){
            if(x>=y){
                System.out.println(x+","+y);
            }else{
                System.out.println(y+","+x);
            }
        }
    }
}
