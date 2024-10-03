package EjerciciosBasicosII;

public class EJ50 {
    public static void main(String[] args) {
        String div3="";
        String div5="";
        String div3i5="";
        for(int i=1;i<100;++i){
            if(i%3==0){
                div3=div3+", "+i;
            }
            if (i%5==0) {
                div5=div5+", "+i;
            }
            if(i%3==0 && i%5==0){
                div3i5=div3i5+", "+i;
            }
        }
        System.out.println("Els que es poden dividir entre 3 son:"+div3);
        System.out.println("Els que es poden dividir entre 5 son:"+div5);
        System.out.println("Els que es poden dividir entre 3 i 5 son:"+div3i5);
    }
}
