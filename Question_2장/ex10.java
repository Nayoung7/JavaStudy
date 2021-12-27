package Question_2장;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
		// 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 원의 중심(x,y)과 반지름 입력 >> ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		System.out.print("두 번째 원의 중심과 반지름 입력 >> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();

		double sub1 = Math.abs(x1 - x2) * Math.abs(x1 - x2);
		double sub2 = Math.abs(y1 - y2) * Math.abs(y1 - y2);
		double distance = Math.sqrt(sub1 + sub2);

		if (distance <= (r1 + r2)) {
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		sc.close();

	}

}
