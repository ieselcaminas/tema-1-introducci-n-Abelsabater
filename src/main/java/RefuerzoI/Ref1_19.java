package RefuerzoI;

import java.util.Scanner;

public class Ref1_19 {
    public static void main(String[] args) {
        double vel;
        double tiempo;
        int distancia;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la velocitat que anava en Km/h");
        vel = sc.nextInt();
        System.out.print("Dime la distancia recorreguda en m");
        distancia = sc.nextInt();
        System.out.print("Dime el temps que ha tardat en recorrer la distancia en segons");
        tiempo = sc.nextInt();
        double velqueva=distancia/tiempo;
        if((velqueva*3.6)>vel){
            System.out.println("Es una multa");
        }else{
            System.out.println("Esta correcte");
        }
    }
}
