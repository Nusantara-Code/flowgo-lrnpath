import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kelamin;
        
        System.out.println("masukan kelamin");
        kelamin = input.nextLine();
        if (kelamin.equals("lakilaki")) {
            System.out.println("anda laki-laki");
        } else {
            if (kelamin.equals("perempuan")) {
                System.out.println("anda perempuan");
            } else {
                System.out.println("gender tidak diketahui");
            }
        }
    }
}
