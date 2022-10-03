//SAN MARTYN

import java.util.Scanner;

class satu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String gender;
        System.out.println("Enter your gender: ");
        gender = sc.nextLine();
        System.out.println();
        if (gender.equals("man")) {
            System.out.println("you are man");
        } else {
            if (gender.equals("girl")) {
                System.out.print("you are girl");
           } else {
            System.out.println("ERROR!!!!");
        }
        }
}
}