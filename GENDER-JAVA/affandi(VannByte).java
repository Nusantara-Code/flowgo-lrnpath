import java.util.*;
import java.lang.math;

public class JavaApplication {
	private static Scanner input = new Scanner (System.in);

	public static void main (String[] args) {
		String jeniskelamin;

		jeniskelamin = input.nextLine ();
		if (jeniskelamin.equals("laki-laki")) {
			System.out.println("anda laki-laki");
		} else {
			if (jeniskelamin.equals("perempuan")) {
				System.out.println("anda perempuan");
			} else {
				System.out.println("gender tidak ditemukan");
			}
		}
	}
}