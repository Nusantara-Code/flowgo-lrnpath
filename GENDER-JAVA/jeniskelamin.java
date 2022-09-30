import java.util.Scanner;
public class jeniskelamin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("BIO SINGKAT ANDA");
        System.out.print("NAMA \t: ");
        String nama = input.next();
        System.out.println("SILAHKAN PILIH GENDER");
        System.out.println("(p) PEREMPUAN");
        System.out.println("(l) LAKI LAKI");
        System.out.print("KELAMIN \t: ");
        char kelamin = input2.next().charAt(0);

        if (kelamin == 'p') {
            System.out.println(nama);
            System.out.println("perempuan");
        }else if(kelamin == 'l'){
            System.out.println(nama);
            System.out.println("laki laki");
        }else{
            System.out.println("gender tidak di temukan");
        }

        
    }
}
