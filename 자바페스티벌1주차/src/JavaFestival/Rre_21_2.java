package JavaFestival;

import java.util.Scanner;

public class Rre_21_2 {

	public static void main(String[] args) {
		// A와 B를 입력받아 A-B를 출력하고 A와 B가 모두 0을 입력받으면 프로그램이 종료된다.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("A 입력 : ");
			int a = sc.nextInt();
			System.out.print("B 입력 : ");
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println("결과 : " + (a - b));
			}
		}
		sc.close();

	}

}
