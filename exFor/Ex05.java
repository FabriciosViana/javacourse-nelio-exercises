package exFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
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
