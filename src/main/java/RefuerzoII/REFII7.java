package RefuerzoII;

import java.util.Scanner;

public class REFII7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nºcanal;
        int nªcanalhasta;
        int cuenta1 = 0;
        int cuenta2 = 0;
        System.out.println("En quin numero de canal estas?");
        nºcanal= sc.nextInt();
        System.out.println("Hasta quin numero vols arribar?");
        nªcanalhasta= sc.nextInt();
        for(int i= nºcanal;i!=nªcanalhasta; i++){
            if(i==99){
                i=i-99;
            }
            cuenta1 = cuenta1 +1;
        }
        for(int i=nºcanal;i!=nªcanalhasta;i--){
            if(i==1){
                i=i+99;
            }
            cuenta2 = cuenta2+1;
        }
        if(cuenta1<cuenta2){
            System.out.println("Te falten "+cuenta1+" canals cap avant");
        } else if (cuenta2<cuenta1) {
            System.out.println("Te falten "+cuenta2+" canals cap atras");
        }else{
            System.out.println("Te falten "+cuenta1+" canals cap avant o cap atras");
        }
    }
}