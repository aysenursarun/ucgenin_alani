package ucgenin_alanı;

import java.util.Scanner;

public class ucgenin_alanı {

	public static void main(String[] args) {

		// Üç kenarı alınan üçgenin alanını hesaplama.

		int a, b, c;

		Scanner scan = new Scanner(System.in);

		System.out.print("1. kenarı girin: ");
		a = scan.nextInt();

		System.out.print("2. kenarı girin: ");
		b = scan.nextInt();

		System.out.print("3. kenarı girin: ");
		c = scan.nextInt();

		int cevre = a + b + c;
		int u = cevre / 2;
		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

		System.out.println("Alan: " + alan);

	}

}
