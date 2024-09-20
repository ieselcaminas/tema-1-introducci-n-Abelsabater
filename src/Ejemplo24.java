import java.util.Scanner;
public class Ejemplo24 {
    public static void main(String[] args) {
        double X;
        Scanner sc = new Scanner(System.in);
        int Diez =0 ;
        double notatotal=0;
        double assignatuires=0;
        do{
            System.out.print("Dime una nota ");
            X = sc.nextDouble();
            if (X>-1){
                notatotal+=X;
                assignatuires++;
                if(X==10){
                    Diez++;
                }
            }
        }while(X>-1);
            sc.close();
            System.out.println("La nota mitjana es "+notatotal/assignatuires+"Han hagut "+Diez+" deus");
    }
}