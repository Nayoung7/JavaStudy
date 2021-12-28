package Question_3장;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
