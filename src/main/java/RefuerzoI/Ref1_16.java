package RefuerzoI;

import java.util.Scanner;

public class Ref1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        int Y;
        int Z;
        System.out.println("Dime un numero");
        X=sc.nextInt();
        System.out.println("Dime un altre");
        Y=sc.nextInt();
        System.out.println("Dime un altre");
        Z=sc.nextInt();
        if(X>Y && X>Z){
            System.out.println("El mes gran es el "+X);
        }
        if(Y>Z && Y>X){
            System.out.println("El mes gran es el "+Y);
        }
        if(Z>Y && Z>X){
            System.out.println("El mes gran es el "+Z);
        }
    }
}
