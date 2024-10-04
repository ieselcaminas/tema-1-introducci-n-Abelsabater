package RefuerzoI;

import java.util.ArrayList;
import java.util.Scanner;

public class Ref1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dime un numero: ");
        num = sc.nextInt();
        ArrayList<Integer> pars = new ArrayList<>();
        if (num%2!=0){
            num+=1;
            pars.add(num);
            for (int i = 0; i < 4; i++) {
                num+=2;
                pars.add(num);
            }
        }else{
            for (int i = 0; i < 5; i++) {
                num+=2;
                pars.add(num);
            }
        }
        System.out.println(pars);
    }
}
