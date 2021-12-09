package JavaFestival;

import java.util.Scanner;

public class Rre_20_1 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 최대공약수와 최소공배수를 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 공약수&최소 공배수 구하기");
		System.out.print("숫자1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 >> ");
		int num2 = sc.nextInt();

		int max = 0;
		int min = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
		}
		min = num1 * num2 / max;
		System.out.println("최대공약수 : " + max);
		System.out.println("최소공배수 : " + min);
		sc.close();
	}

}
