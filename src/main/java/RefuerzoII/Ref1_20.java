package RefuerzoII;

import java.util.Scanner;

public class Ref1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numhoj;
        System.out.println("Dime quantas hojas hay");
        numhoj = sc.nextInt();
        if(numhoj<3){
            System.out.println("Imposible");
        }else{
            System.out.println(numhoj/4);
        }
    }
}
