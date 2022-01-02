package Question_3장;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// 2개의 정수를 입력받아 곱을 구하는 Multiply 클래스
		// 실수 입력하였을 때, 예외 발생 없이 정상적으로 처리되도록 여외 처리 코드를 삽입하여 Nultiply 클래스 수정

		Scanner sc = new Scanner(System.in);
		int n = 0, m= 0;
		while (true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력 >> ");
				n = sc.nextInt();
				m = sc.nextInt();
				System.out.println(n + "x" + m + "=" + n * m);
				break;
			} catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
