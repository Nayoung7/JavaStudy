package Question_2장;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현된다. 키보드로부터 직사각형을 구성하는 두 점
		// (x1, y1), (x2, y2)를 입력받아 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는
		// 프로그램을 작성하라.

		Scanner sc = new Scanner(System.in);
		System.out.print("x1, y1의 값을 입력해주세요 >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("x2, y2의 값을 입력해주세요 >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		boolean a = inRect(x1, y1);
		boolean b = inRect(x2, y2);

		if (a == true || b == true) {
			System.out.println("두 사각형이 충돌합니다.");
		} else {
			System.out.println("두 사각형이 충돌하지 않습니다.");
		}
		sc.close();

	}

	public static boolean inRect(int x, int y) {
		if ((x >= 100 && x <= 200) & (y >= 100 && y <= 200)) {
			return true;
		} else {
			return false;
		}
	}

}
