package RefuerzoI;

import java.util.Scanner;

public class Ref1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        System.out.println("Fica un numero");
        X = sc.nextInt();
        if(X==0){
            System.out.println("Si multipliques 0 per qualsevol altre numero es 0");
        }else{
            int y;
            System.out.println("Fica un altre");
            y = sc.nextInt();
            sc.close();
            System.out.println("El resultat es "+X*y);
        }
    }
}
