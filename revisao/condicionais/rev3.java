package condicionais;
import utils.MyScanner;

public class rev3 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a%b == 0 || b%a ==0) {
            System.out.println("SÃO MÚLTIPLOS");
        }else{
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }


        sc.close();
    }
}
