package RefuerzoII;

import java.util.Scanner;

public class Ref1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario;
        int ingresos;
        int gastos;
        System.out.print("Ingrese el salario normal");
        salario = sc.nextInt();
        System.out.println("Dime els ingresos que has conseguit este mes");
        ingresos = sc.nextInt();
        System.out.println("Dime els gastos de este mes");
        gastos = sc.nextInt();
        if(salario+ingresos < gastos) {
            System.out.println("No arribes");
        }else{
            System.out.println("Arribes");
        }
    }
}
