import java.util.Scanner;
import java.lang.Math;

public class DimasAgusPrasetyo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int counter;

        counter = 0;
        while (counter<20) {
        counter=counter + 2;
        System.out.println("looping ke -" + counter);


        System.out.println("menemtukan jenis kelamin");
        System.out.println("masukan jenis kelamin");
        String gender = userInput.next();

        if (gender.equals("laki-laki")) || gender.equals("laki-laki")) {
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
