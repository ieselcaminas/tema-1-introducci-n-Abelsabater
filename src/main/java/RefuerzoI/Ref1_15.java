package RefuerzoI;

import java.util.Scanner;

public class Ref1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        int Y = 0;
        int Z = 0;
        System.out.println("Dime el temps en segons");
        X = sc.nextInt();
        if(X>=60){
            X= X-60*Y;
            Y=X/60;
            if(Y>=60){
                Z=Y/60;
            }
        }
        System.out.println("El temps es "+Z+":"+(Y-Z*60)+":"+(X-Y*60));
    }
}
