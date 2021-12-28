package Question_3장;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// 키보드에서 정수로 된 돈의 액수를 입력받아
		// 오만원권, 만원권, 천원권, 500원짜리 동전, 100원 동전, 50원, 10원, 1원짜리 동전이 각 몇개로 변환되는지 출력하라.
		// 반드시 다음 배열을 이용하고 반복문으로 작성하라

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] == 0) {
				continue;
			} else {
				System.out.println(unit[i] + "원 짜리 : " + money / unit[i] + "개");
				money %= unit[i];
			}
		}
		sc.close();

	}

}
