import java.util.*;
import java.lang.Math;

public class edga{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int gender;
        
        System.out.println("masukkan gender anda : ");
        System.out.println("1.gender anda adalah  pria");
        System.out.println("2. gender anda adalah waniita");
        gender = input.nextInt();
        if (gender == 1) {
            System.out.println("gender pria");
        } else if (gender == 2){
                System.out.println("gender wanita");
            } else {
                System.out.println("gender tidak di ketahui");
            }
        }
    }

