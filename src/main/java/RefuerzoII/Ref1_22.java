package RefuerzoII;

import java.util.Scanner;

public class Ref1_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casillas;
        int posicion=1;
        int dados;
        System.out.println("Quantes casillas hi ha?");
        casillas = sc.nextInt();
        do{
            System.out.println("Quin es el numero de dados");
            dados = sc.nextInt();
            posicion=posicion+dados;
            if(posicion>casillas){
                posicion=casillas-(posicion-casillas);
                System.out.println("Queden "+(casillas-posicion)+" casiles");
            }else{
                System.out.println("Queden "+(casillas-posicion)+" casiles");
            }
        }while(posicion != casillas);
        System.out.println("Ja s'ha acabat");
    }
}