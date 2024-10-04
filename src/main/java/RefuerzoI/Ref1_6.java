package RefuerzoI;

import java.util.Scanner;

public class Ref1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        int y;
        System.out.print("dona'm un numero ");
        X = sc.nextInt();
        System.out.print("dona'm un altre ");
        y = sc.nextInt();
        sc.close();
        if(y==0){
            System.out.println("Error, no pots dividir entre 0");
        }else{
            System.out.println("El resultat es"+X/y);
        }
    }
}
