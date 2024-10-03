package Ejemplos1erospasos;

import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pagarporhora;
        double horas;
        System.out.println("Quants diners te paguen per hora");
        pagarporhora=scanner.nextDouble();
        System.out.println("Quantes hores has fet?");
        horas=scanner.nextDouble();
        scanner.close();
        double preunormal=pagarporhora*horas;
        double preuhoresextra=pagarporhora*1.5*(horas-35);
        double suma;
        double impostos;
        if(horas<=35){
            suma=preunormal;
        }else{
            suma=preunormal+preuhoresextra;
        }
        if(suma<=500){
            impostos=0;
        } else if (suma<=900) {
            impostos=(suma-500)*25/100;
        }else{
            impostos=((suma-900)*45/100)+400*25/100;
        }
        System.out.println("El salari brut es "+suma);
        System.out.println("El impostos es "+impostos);
        System.out.println("El salari net es "+(suma-impostos));
    }
}
