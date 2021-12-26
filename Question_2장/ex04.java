package Question_2장;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라, 평균값이 아님

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int middle = 0;

		if (num1 > num2 && num1 < num3) {
			middle = num1;
		} else if (num1 > num3 && num1 < num2) {
			middle = num1;
		} else if (num2 > num1 && num2 < num3) {
			middle = num2;
		} else if (num2 > num3 && num2 < num1) {
			middle = num2;
		} else if (num3 > num2 && num3 < num1) {
			middle = num3;
		} else if (num3 > num1 && num3 < num2) {
			middle = num3;
		}
		System.out.println("중간 값은 " + middle);
		sc.close();
	}

}
