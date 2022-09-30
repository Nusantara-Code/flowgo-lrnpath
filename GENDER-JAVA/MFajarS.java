package pkg7_if;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner (System.in);
        
        System.out.print("APA JENIS KELAMIN ANDA \t: ");
        a = input.nextLine();
        
        switch(a) {
            case "laki-laki":
            System.out.println("STATUS \t\t\t: ANDA LAKI-LAKI");
            break;
            case "LAKI-LAKI":
            System.out.println("STATUS \t\t\t: ANDA LAKI-LAKI");
            break;
            case "laki laki":
            System.out.println("STATUS \t\t\t: ANDA LAKI-LAKI");
            break;
            case "PEREMPUAN":
            System.out.println("STATUS \t\t\t: ANDA PEREMPUAN");
            break;
            case "perempuan":
            System.out.println("STATUS \t\t\t: ANDA PEREMPUAN");
            break;
            default :
                System.out.println("STATUS \t\t\t: GENDER TIDAK DIKETAHUI");
        }
        
    }
    
}
