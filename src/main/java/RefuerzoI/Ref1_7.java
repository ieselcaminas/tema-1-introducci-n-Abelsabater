package RefuerzoI;

import java.util.Scanner;

public class Ref1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        System.out.println("Dime un numero");
        X = sc.nextInt();
        sc.close();
        if(X%2==0 || X%3==0){
            System.out.println("El numero es multiple de 2 o de 3");
        }
    }
}
