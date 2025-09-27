package exFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = sc.nextInt();
        double pound1 = 2.0;
        double pound2 = 3.0;
        double pound3 = 5.0;
        double parcialResult = 0;
        double dividerSum = pound1 + pound2 + pound3;

        for (int i = 1; i <= N; i++) {
            System.out.println("Digite o próximo número: ");
            double number = sc.nextDouble();
            double result;
            switch (i) {
                case 1:
                    result = number * pound1;
                    parcialResult += result;
                    System.out.println(parcialResult);

                    break;
                case 2:
                    result = number * pound2;
                    parcialResult += result;
                    System.out.println(parcialResult);
                    break;

                case 3:
                    result = number * pound3;
                    parcialResult += result;
                    System.out.println(parcialResult);
                    break;

                default:
                    break;
            }
        }
        double finalResult = parcialResult / dividerSum;
        System.out.printf("%.1f%n", finalResult);
        sc.close();
    }
}
