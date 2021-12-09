package JavaFestival;

import java.util.Scanner;

public class Rre_22_2 {

	public static void main(String[] args) {
		// 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
