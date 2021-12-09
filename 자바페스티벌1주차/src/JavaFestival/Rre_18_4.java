package JavaFestival;

import java.util.Scanner;

public class Rre_18_4 {

	public static void main(String[] args) {
		// 세자리수 * 세자리수 과정과 결과까지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번재 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번재 숫자 입력 >> ");
		int num2 = sc.nextInt();

		int one = num2 % 10;
		int ten = num2 % 100 / 10;
		int hundred = num2 / 100;

		System.out.println(num1 * one);
		System.out.println(num1 * ten);
		System.out.println(num1 * hundred);
		System.out.println(num1 * num2);
		sc.close();

	}

}
