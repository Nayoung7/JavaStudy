package JavaFestival;

import java.util.Scanner;

public class Rre_30_2 {

	public static void main(String[] args) {
		// num1, num2, op를 매개변수로 받아 num1과 num2를 op에 맞게 연산한 결과값을
		// 반환해주는 cal 메소드를 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/) 입력 : ");
		String op = sc.next();

		System.out.println(cal(num1, num2, op));
		sc.close();
	}

	public static int cal(int num1, int num2, String op) {
		if (op.equals("+")) {
			return num1 + num2;
		} else if (op.equals("-")) {
			return num1 - num2;
		} else if (op.equals("*")) {
			return num1 * num2;
		} else {
			return num1 / num2;
		}

	}

}
