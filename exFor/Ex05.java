package exFor;
import utils.MyScanner;

public class Ex05 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int total = 1;
        int N = sc.nextInt();
        for (int i = N; i > 0; i--) {
            total *= i;
            System.out.println(i);
        }
        System.out.println("O fatorial de " + N +" é " + total);
        sc.close();
    }

}
