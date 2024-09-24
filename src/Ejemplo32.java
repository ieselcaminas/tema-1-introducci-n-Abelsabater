import java.util.ArrayList;

public class Ejemplo32 {
    public static void main(String[] args) {

        int num=1;
        int num2=1;
        String fibonacci=num +", "+num2;
        int num3;
        for(int i = 3; i<=40; i++){
            num3=num+num2;
            fibonacci+=", "+num3;
            num=num2;
            num2=num3;
        }
        System.out.println(fibonacci);
    }
}