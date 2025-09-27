
package exFor;
import utils.MyScanner;

public class Ex01 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();

        for(int i=1; i<=x; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
            
        }
        sc.close();
    }
}
