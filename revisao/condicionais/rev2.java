package condicionais;
import utils.MyScanner;

public class rev2 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int number = sc.nextInt();
        if (number%2==0) {
            System.out.println("PAR");    
        } else{
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
