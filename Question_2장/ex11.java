package Question_2장;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// 숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 11,1,2의 경우 "겨울"을,
		// 그 외 숫자를 입력한 경우 "잘못입력"을 출력하는 프로그램을 작성하라

		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요 (1~12) >> ");
		int month = sc.nextInt();

		switch (month) {
		case 3, 4, 5:
			System.out.println("봄");
			break;

		case 6, 7, 8:
			System.out.println("여름");
			break;

		case 9, 10, 11:
			System.out.println("가을");
			break;

		case 12, 1, 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력");

		}
		sc.close();
	}

}
