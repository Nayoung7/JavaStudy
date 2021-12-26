package Question_2장;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 출력. $1 = 1100원으로 가정
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >> ");
		int won = sc.nextInt();
		double dal = won / 1100.0;
		System.out.printf("%d원은 $%.1f입니다.", won, dal);
		
		sc.close();
	}

}
