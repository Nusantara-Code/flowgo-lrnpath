import java.util.*;
import java.lang.Math;

public class edga2 {
    public static void main(String[] args) {
        int a, b;
        
        a = (int) (-1);
        b = 0;
        while (a < 9) {
            a = a + 2;
            System.out.println(Integer.toString(a) + " adalah bilangan ganjil");
            b = b + 2;
            System.out.println(Integer.toString(b) + " adalah bilangan genap");
        }
    }
}
