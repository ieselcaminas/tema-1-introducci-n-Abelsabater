package RefuerzoI;

import java.util.Scanner;

public class Ref1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int Y;
        System.out.println("Fica el primer numero");
        x = scanner.nextInt();
        System.out.println("Fica el segon");
        Y = scanner.nextInt();
        scanner.close();
        if(Y%x==0){
            System.out.println("El primer numero es multiple del segon");
        } else{
            System.out.println("El primer numero no es multiple del segon");
        }
    }
}
