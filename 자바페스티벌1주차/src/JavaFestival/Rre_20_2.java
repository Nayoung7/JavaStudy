package JavaFestival;

import java.util.Scanner;

public class Rre_20_2 {

	public static void main(String[] args) {
		// 1보다 큰 정수(N)를 입력하여 N!값을 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();

		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("출력 : " + result);
		sc.close();
	}

}
