import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        
        System.out.println("Masukkan Jenis Kelamin Anda :");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        a = input.nextInt();
        if (a == 1) {
            System.out.println("Anda Laki-laki");
        } else {
            if (a == 2) {
                System.out.println("Anda Perempuan");
            } else {
                System.out.println("Gender tidak diketahui");
            }
        }
    }
}
