import java.util.Scanner;
import java.util.ArrayList;
public class Ejemplo31 {
    public static void main(String[] args) {
        int X;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> divisores = new ArrayList<>();
        System.out.println("Dime un numero: ");
        X = sc.nextInt();
        for (int i = 1; i <= X; i++) {
            if (X % i == 0) {
                divisores.add(i);
            }
        }
        System.out.println(divisores);
    }
}
