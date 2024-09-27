package RefuerzoII;

import java.util.Scanner;

public class REF1 {
    public static int diasHastaLanochevieja(int dia){
        return dia;
    }
    public static void main(String[] args) {
        int dia;
        int mes;
        int diasmes=0;
        int mesesnoche=12;
        int diastotal=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia");
        dia = sc.nextInt();
        System.out.println("Dime el mes");
        mes = sc.nextInt();
        diasHastaLanochevieja(dia);
        if(dia>31 || mes>12){
            System.out.println("T'has pasat de mesos o dies revisau");
        }else{
            if(mes==2 && dia>28){
                System.out.println("Febrer nomes pot tindre fins a 29 dies");
            } else if (mes==4 && dia>30 || mes==6 && dia>30 || mes==9 && dia>30 || mes==11 && dia>30) {
                System.out.println("Abril (4), juny (6) septembre(9) i novembre (11) no tenen mes de 30 dies");
            }else{
                for(int i=mes+1;i<=mesesnoche;i++){
                    switch(i){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            diasmes=31;
                            break;
                        case 2:
                            diasmes=28;
                            break;
                        default:
                            diasmes=30;
                            break;
                    }
                    diastotal=diastotal+diasmes;
                }
                switch(mes){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        diasmes=31;
                        break;
                    case 2:
                        diasmes=28;
                        break;
                    default:
                        diasmes=30;
                        break;
                }
                diastotal=diastotal+(diasmes-dia);
                System.out.println("Falten "+diastotal+" dias");
            }
        }
    }
}
