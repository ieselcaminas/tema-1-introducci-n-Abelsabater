import java.util.Scanner;

public class Ejemplo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa un numero");
        int numero = sc.nextInt();
        for (int i =2; i <= numero+1; i++) {
            if (numero%i==0 && i!=numero) {
                System.out.println("No es un numero prim");
                break;
            }
            if(numero%i!=0 && i>=numero){
                System.out.println("Es un numero prim");
                break;
            }
        }
    }
}
