import java.util.*;
import java.lang.Math;

public class gender {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String pilihan;
        
        System.out.println("masukan gender");
        pilihan = input.nextLine();
        if (pilihan.equals("laki laki")) {
            System.out.println("anda laki laki");
        } else {
            if (pilihan.equals("perempuan")) {
                System.out.println("anda perempuan");
            } else {
                System.out.println("tidak diketahui");
            }
        }
    }
}
