package JavaFestival;

import java.util.Scanner;

public class Rre_21_1 {

	public static void main(String[] args) {
		// 소인수 분해를 해주는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요 : ");
		int num = sc.nextInt();

		System.out.print(num + " = ");
		for (int i = 2; i <= num; i++) {
			// i는 고정인상태로 num값만 나눠짐
			// 그러다 num % i가 0이 아니면 while문 밖으로 나와 for문에서 1증가
			while (num % i == 0) {
				num = num / i;
				System.out.print(i);

				if (num == 1) {
					break;
				} else {
					System.out.print("*");
				}
			}

		}
		sc.close();

	}
}
