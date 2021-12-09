package JavaFestival;

import java.util.Scanner;

public class Rre_18_1 {

	public static void main(String[] args) {
		// 정수를 입력받아 1의 자리에서 반올림한 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();

		int result = 0;
		System.out.print("반올림 후 값 : ");
		if (num % 10 > 4) {
			result = (num + 10) / 10 * 10;
		} else {
			result = num / 10 * 10;
		}
		System.out.println(result);
		sc.close();
	}

}
