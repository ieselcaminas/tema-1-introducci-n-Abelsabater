import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        System.out.println("Posa un numero per a que te digue la seua taula de multiplicar ");
        X = sc.nextInt();
        for(int i=1; i<=10;++i){
            int operacio=X*i;
            System.out.println(X+"x"+i+"="+operacio);
        }
    }
}
