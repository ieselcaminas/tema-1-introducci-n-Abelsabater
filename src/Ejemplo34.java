import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        int suma=0;
        System.out.print("Posa un numero: ");
        num=sc.nextInt();
        System.out.print("Posa un altre: ");
        num2=sc.nextInt();
        for(int i=0;i>=num2;i++){
           suma+=num;
       }
        System.out.println(num+" * "+num2+" = "+suma);
    }
}
