//ERWIN SETIAWAN2   

import java.util.Scanner;
class satu {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in) ;

        String kelamin ;
        System.out.println("MAASUKAN GENDER ANDA");
        kelamin = sc.nextLine() ;
        if (kelamin.equals("LAKI-LAKI")|| kelamin.equals("laki"))  {
            System.out.println("ANDA LAKI-LAKI MAS");
        } else {
            if (kelamin.equals("perempuan")) {
                System.out.println("ANDA PEREMPUAN MBAK");
            } else {
                System.out.println("TIDAK DIKETAHUI");
            }
        }   
    }
}