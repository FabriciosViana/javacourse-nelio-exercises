package condicionais;
import utils.MyScanner;

public class rev5 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int option =sc.nextInt();
        int quantity = sc.nextInt();
        double price;
        String productName;

        switch (option) {
            case 1:
                price = 4.00;
                productName = "Cachorro Quente";
                System.out.printf("%d %s R$ %.2f%n", quantity, productName, quantity * price);
                break;
            case 2:
                price = 4.50;
                productName = "X-Salada";
                System.out.printf("%d %s R$ %.2f%n", quantity, productName, quantity * price);
                break;
            case 3:
                price = 5.00;
                productName = "X-Bacon";
                System.out.printf("%d %s R$ %.2f%n", quantity, productName, quantity * price);
                break;
            case 4:
                price = 2.00;
                productName = "Torrada simples";
                System.out.printf("%d %s R$ %.2f%n", quantity, productName, quantity * price);
                break;
            case 5:
                price = 1.50;
                productName = "Refrigerante";
                System.out.printf("%d %s R$ %.2f%n", quantity, productName, quantity * price);
            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }
}
