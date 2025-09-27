package exFor;
import utils.MyScanner;

public class Ex04 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            System.out.println("Digite o primeiro número: ");
            double numerator = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            double denominator = sc.nextInt();
            double result = numerator / denominator;
            if (denominator == 0) {
                System.out.println("Divisão impossível");
            }else{
                System.out.println(result);
            }
        }

        sc.close();
    }
}
