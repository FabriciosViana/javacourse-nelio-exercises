package condicionais;
import utils.MyScanner;

public class rev4 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int initialHour = sc.nextInt();
        int finalHour = sc.nextInt();
        int totalHour;
        if (initialHour<finalHour) {
            System.out.println("mesmo dia");
            totalHour = (initialHour - finalHour) *-1;
            System.out.println(totalHour + " Horas");
            
        }else if (initialHour>finalHour) {
            System.out.println("outro dia");
            totalHour = 24 - initialHour + finalHour;
            System.out.println(totalHour + " horas");
        } else if(initialHour == finalHour){
            System.out.println("24 HORAS");
        }
        
        sc.close();
    }
}
