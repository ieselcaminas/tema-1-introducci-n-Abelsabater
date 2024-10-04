package EjerciciosBasicosII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EJ165 {
    public static void main(String[] args) {
        ArrayList<Integer> llisnum=new ArrayList<>();
        int num;
        int num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime la llargaria de la llista");
        num= sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Dime un");
            num2= sc.nextInt();
            llisnum.add(num2);
        }
        System.out.println(llisnum);
        Collections.sort(llisnum);
        System.out.println(llisnum);

    }
}
