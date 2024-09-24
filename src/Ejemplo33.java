public class Ejemplo33 {
    public static void main(String[] args) {
        double num=1;
        double num2=1;
        String fibonacci=num +", "+num2;
        double num3;
        for(int i = 3; i<=40; i++){
            num3=(num2+num);
            fibonacci+=" relacion= "+num2/num;
            num=num2;
            num2=num3;
        }
        System.out.println(fibonacci);
    }
}
