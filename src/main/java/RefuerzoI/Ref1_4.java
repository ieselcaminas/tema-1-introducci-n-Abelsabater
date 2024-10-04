package RefuerzoI;

import java.util.Scanner;

public class Ref1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Dime un numero");
        x = scanner.nextInt();
        scanner.close();
        if(x%10==0) {
            System.out.println("El primer numero es multiple de 10");
            System.out.println("Posa un altre");
            y = scanner.nextInt();

            if (y % 10 == 0) {
                System.out.println("El segon numero tambe es multiple de 10");
            }
        }
    }
}
