package EjerciciosBasicosII;

import java.util.Scanner;

public class EJ86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese el numero: ");
        num = sc.nextInt();
        do{
            if(num%2==0){
                num /=2;
            }else{
                num = num*3+1;
            }
            System.out.println(num);
        }while(num!=1);
    }
}
