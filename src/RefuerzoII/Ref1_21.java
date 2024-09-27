package RefuerzoII;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ref1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ingresos;
        int gastos;
        System.out.println("Dime els ingresos que has conseguit este mes");
        ingresos = sc.nextInt();
        System.out.println("Dime els gastos de este mes");
        gastos = sc.nextInt();
        if(ingresos < gastos) {
            System.out.println("No arribes");
        }else{
            System.out.println("Arribes");
        }
    }
}
