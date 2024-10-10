package RefuerzoII;

import java.util.Scanner;

public class REFII6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String num;
        int unidad;
        System.out.println("Dime un número");
        num= sc.nextLine();
        for (int i = 0; i < num.length(); i++) {
            unidad=num.charAt(i)-48;
            if(unidad%2!=0){
                System.out.println("No es hyperpar");
                break;
            }
            if(unidad%2==0 && i==num.length()-1){
                System.out.println("Es hyperpar");
                break;
            }
        }
    }
}
