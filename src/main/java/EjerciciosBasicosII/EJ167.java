package EjerciciosBasicosII;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ167 {
    public static void main(String[] args) {
        ArrayList<Integer> llistanum=new ArrayList<>();
        ArrayList<Integer> ceros= new ArrayList<>();
        int num;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime la llargaria de la llista");
        num= sc.nextInt();
        for (int i = 0; i<num; i++) {
            System.out.println("Dime un numero");
            num2= sc.nextInt();
            if(num2!=0){
                llistanum.add(num2);
            }else{
                ceros.add(num2);
            }
        }
        for (int i = 0; i < ceros.size(); i++) {
            llistanum.add(0);
        }
        System.out.println(llistanum);
    }
}
