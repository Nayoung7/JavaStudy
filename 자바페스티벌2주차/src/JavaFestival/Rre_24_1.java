package JavaFestival;

import java.util.Scanner;

public class Rre_24_1 {

	public static void main(String[] args) {
		// N과 X를 입력받고 N개의 정수를 추가로 입력받는다.
		// N개의 숫자 중 X보다 작은 수만 출력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 : ");
		int n = sc.nextInt();
		System.out.print("X 입력 : ");
		int x = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}
		System.out.print("결과 >> ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] < x) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();

	}

}
