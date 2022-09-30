//BILANGAN BULAT SEBANYAK 10 baris

import java.util.Scanner;

public class bilangangenap{
    public static void main(String[] args) {
        //String nd = "hasasa";
        Scanner input =  new Scanner(System.in);
        System.out.println("BILANGAN BULAT");
        System.out.println(
            "JIKA MAU 10 BISA MASUKAN YANG TERAKHIR 20"
            );

        System.out.print("AWAL : ");
        int n1 = input.nextInt();
        System.out.println("AKHIR : ");
        int n2 =  input.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " , ");
            }
        }
    } 
}
