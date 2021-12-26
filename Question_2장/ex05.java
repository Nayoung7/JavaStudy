package Question_2장;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 삼각형이 되려면 두 변의 합이 다른
		// 한 변의 합보다 커야 한다.

		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		System.out.print("정수 3개를 입력하시오 >> ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];
		boolean result = false;
		// 삼각형의 조건 : 가장 긴 변의 길이가 나머지 두 변의 합보다 작다.
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		if (max == array[0]) {
			if (array[0] < array[1] + array[2]) {
				result = true;
			}
		} else if (max == array[1]) {
			if (array[1] < array[0] + array[2]) {
				result = true;
			}
		} else if (max == array[2]) {
			if (array[2] < array[0] + array[1]) {
				result = true;
			}
		}
		if (result) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 될 수 없습니다.");
		}
		sc.close();
	}

}
