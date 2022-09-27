import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String gender;
        
        System.out.println("menemtukan jenis kelamin");
        System.out.println("masukan jenis kelamin");
        gender = input.nextLine();
        if (gender.equals("laki-laki")) {
            System.out.println("anda laki-laki");
        } else {
            if (gender.equals("perempuan")) {
                System.out.println("anda perempuan");
            } else {
                System.out.println("gender tidak diketahui");
            }
        }
    }
}
