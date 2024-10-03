package EjerciciosBasicosII;

import java.util.Scanner;

public class EJ61 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String paraula;
        String cadena = "";
        System.out.println("Posa una paraula");
        paraula= sc.nextLine();
        for(int i= paraula.length()-1;i>=0;i--){;
            cadena+=paraula.charAt(i);
        }
        System.out.println(cadena);
    }
}
