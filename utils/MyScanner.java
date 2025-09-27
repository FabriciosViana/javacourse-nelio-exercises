package utils;

import java.util.Locale;
import java.util.Scanner;

public class MyScanner {
    private Scanner scanner;

    public MyScanner(){
        scanner = new Scanner(System.in).useLocale(Locale.US);
    }

    public String nextLiene(){
        return scanner.nextLine();
    }

    public int nextInt(){
        return scanner.nextInt();
    }

    public double nextDouble(){
        return scanner.nextDouble();
    }
    public void close(){
        scanner.close();
    }
}
