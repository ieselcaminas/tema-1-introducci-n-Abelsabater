package RefuerzoI;

import java.util.Scanner;

public class Ref1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        int y;
        System.out.println("Dime un numero");
        X = sc.nextInt();
        System.out.println("Dime un altre");
        y = sc.nextInt();
        sc.close();
        if(X%2==0 ||y%2==0){
            System.out.println("Almenys un dels dos es par");
        }
    }
}
