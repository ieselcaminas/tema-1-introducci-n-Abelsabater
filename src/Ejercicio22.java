import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos=0;
        for(int i=0; i<=10;i++){
            int X;
            System.out.println("Dime un numero");
            X=sc.nextInt();
            if(X>0){
                positivos++;
            }
        }
        sc.close();
        System.out.println(positivos);
    }
}
