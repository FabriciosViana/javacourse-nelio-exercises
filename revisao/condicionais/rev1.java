package condicionais;
import java.util.Locale;
import java.util.Scanner;

public class rev1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int number = sc.nextInt();

        if(number>=0){
            System.out.println("NÃO NEGATIVO");
        } else{
            System.out.println("NEGATIVO ");
        }
        sc.close();
    }
}