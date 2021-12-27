package Question_2장;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다.
		// (100,100)과 (200,200)의 두점으로 이루어진 사각형이 있을때
		// 정수 x, y 값을 입력 받고 점 (x,y)가 이 직사각형 안에 있는지를 판별

		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
			System.out.printf("(%d,%d)는 사각형 안에 있습니다.", x, y);
		} else {
			System.out.printf("(%d,%d)는 사각형 안에 있지 않습니다.", x, y);
		}
		sc.close();

	}

}
