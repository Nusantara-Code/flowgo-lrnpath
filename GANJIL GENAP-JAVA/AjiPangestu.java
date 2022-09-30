import java.util.Scanner;

public class AjiPangestu{

    public static void main(String[] args) {
        int x=0;
        while (x<20){
            x=x+2;
            System.out.println(x);}

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan Gender : ");
        String gender = userInput.next();

        if (gender.equals("laki-laki") || gender.equals("laki")) {
            System.out.println("anda laki-laki");
        } else if (gender.equals("perempuan")) {
            System.out.println("anda perempuan");
        }else
            System.out.println("anda tidak memiliki gender");
    }
}
