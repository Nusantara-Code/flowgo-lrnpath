import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String gender;
        
        System.out.println("Masukkan jenis kelamin anda?");
        gender = input.nextLine();
        if (gender.equals("laki-laki")) {
            System.out.println("Anda adalah laki-laki");
        } else {
            System.out.println("gender tidak diketahui");
        }
    }
}
