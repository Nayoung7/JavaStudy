package Question_2장;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받고
		// 실수 값으로 다른 점(x,y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.

		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심(a,b)과 반지름(r) 입력 >> ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double r = sc.nextDouble();

		System.out.print("점 (x,y) 입력 >> ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if ((x >= a - r && x <= a + r) && (y >= b - r && y <= b + r)) {
			System.out.printf("점 (%.1f, %.1f)는 원 안에 있다.", x, y);
		} else {
			System.out.printf("점 (%.1f, %.1f)는 원 밖에 있다.", x, y);
		}
		sc.close();
	}

}
