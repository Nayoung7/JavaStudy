package Question_2장;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원, 50원, 10원, 1원짜리 동전 각 몇개로
		// 변환되는지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int num = sc.nextInt();

		System.out.println("오만원권 : " + num / 50000 + "매");
		num %= 50000;
		System.out.println("만원권 : " + num / 10000 + "매");
		num %= 10000;
		System.out.println("천원권 : " + num / 1000 + "매");
		num %= 1000;
		System.out.println("백원 : " + num / 100 + "개");
		num %= 100;
		System.out.println("오십원 : " + num / 50 + "개");
		num %= 50;
		System.out.println("십원 : " + num / 10 + "개");
		num %= 10;
		System.out.println("일원 : " + num + "개");
		sc.close();
	}

}
