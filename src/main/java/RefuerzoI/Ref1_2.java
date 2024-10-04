package RefuerzoI;

import java.util.Scanner;

public class Ref1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Di un numero");
        x = scanner.nextInt();
        scanner.close();
        if(x%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
