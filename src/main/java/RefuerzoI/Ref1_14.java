package RefuerzoI;

import java.util.Scanner;

public class Ref1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        int y;
        System.out.print("Dime un numero");
        X = sc.nextInt();
        System.out.print("Dime un altre");
        y = sc.nextInt();
        sc.close();
        if(X>0 && y<0 || X<0 && y>0) {
            System.out.println("Un dels dos es positiu");
        } else if (X>0 && y>0) {
            System.out.println("Son positius");
        } else if (X<0 && y<0) {
            System.out.println("Son negatius");
        }

    }
}
