package JavaFestival;

import java.util.Scanner;

public class Rre_18_3 {

	public static void main(String[] args) {
		// À±³âÀ» ±¸ÇÏ´Â ÇÁ·Î±×·¥ ÀÛ¼º
		Scanner sc = new Scanner(System.in);
		System.out.print("³âµµ ÀÔ·Â >> ");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("À±³â");
		} else if (year % 400 == 0) {
			System.out.println("À±³â");
		} else {
			System.out.println("À±³â ¾Æ´Ô");
		}
		sc.close();

	}

}
