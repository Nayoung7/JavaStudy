package JavaFestival;

import java.util.Scanner;

public class Rre_18_2 {

	public static void main(String[] args) {
		// 거스름돈을 입력받아 내어줘야 하는 지폐의 개수를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 금액 : ");
		int money = sc.nextInt();

		System.out.println("잔돈 변환");
		int a = money / 10000;
		int b = money % 10000 / 5000;
		int c = money % 10000 % 5000 / 1000;
		int d = money % 10000 % 5000 % 1000 / 500;
		int e = money % 10000 % 5000 % 1000 % 500 / 100;

		System.out.println("10000원 : " + a + "개");
		System.out.println("5000원 : " + b + "개");
		System.out.println("1000원 : " + c + "개");
		System.out.println("500원 : " + d + "개");
		System.out.println("100원 : " + e + "개");
		sc.close();
	}

}
