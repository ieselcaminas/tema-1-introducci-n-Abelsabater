package RefuerzoI;

import java.util.Scanner;

public class Ref1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Dime un numero");
        x = scanner.nextInt();
        scanner.close();
        System.out.println("El doble es "+x*2+" i el triple es "+x*3);
    }
}
