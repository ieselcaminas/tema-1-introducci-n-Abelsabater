import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> lletres = new ArrayList<>();
        ArrayList<Character> lletres2 = new ArrayList<>();
        String palabra;
        System.out.println("Dime una paraula o una frase");
        palabra = sc.nextLine();
        for(int i=0; i<palabra.length(); i++){
            if(palabra.charAt(i)!=' '){
                lletres.add(palabra.charAt(i));
            }
        }
        for(int i=palabra.length()-1; i>=0; i--){
            if(palabra.charAt(i)!=' '){
                lletres2.add(palabra.charAt(i));
            }
        }
        if(lletres2.equals(lletres)){
            System.out.println("Es polindroma");
        }else{
            System.out.println("No es polindroma");
        }
    }
}
