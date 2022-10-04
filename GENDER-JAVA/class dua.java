//RONI SYAHPUTRA

import java.util.Scanner;

class dua {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    String gender;
    System.out.println("Enter your gender: ");
    gender = sc.nextLine();
    System.out.println();
    if (gender.equals("male")) {
        System.out.println("you are male");
    } else {
        if (gender.equals("female")) {
            System.out.println("you are female");
        } else {
        System.out.println("EROR!!!");
        }
        }
    }
    }