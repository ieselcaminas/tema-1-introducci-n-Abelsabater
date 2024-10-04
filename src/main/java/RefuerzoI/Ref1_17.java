package RefuerzoI;

import java.util.Scanner;

public class Ref1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        int Y;
        System.out.println("Dime un numero");
        X=sc.nextInt();
        System.out.println("Dime un altre");
        Y=sc.nextInt();
        if(X==Y){
            System.out.println("Els nombres coincideixen");
        } else if (X>Y) {
            System.out.println("El nombre mes gran es "+X);
        } else if (X<Y) {
            System.out.println("El nombre mes gran es "+Y);
        }
    }
}
