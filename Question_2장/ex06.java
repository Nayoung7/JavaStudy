package Question_2장;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// 369게임
		// 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고
		// 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int num = sc.nextInt();
		int cnt = 0;
		if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
			cnt++;
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				cnt++;
			}
		}

		if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
			cnt++;
			if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
				cnt++;
			}
		}
		if (cnt == 2 || cnt == 4) {
			System.out.println("박수짝짝");
		} else if (cnt == 1) {
			System.out.println("박수짝");
		}

	}

}
