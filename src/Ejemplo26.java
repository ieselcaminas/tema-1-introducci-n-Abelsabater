import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        int y;
        System.out.println("Posa un numero per a que te digue la seua taula de multiplicar ");
        X = sc.nextInt();
        System.out.println("Hasta quan vols que el multiplique");
        y = sc.nextInt();
        for(int i=1; i<=y;++i){
            int operacio=X*i;
            System.out.println(X+"x"+i+"="+operacio);
        }
    }
}
