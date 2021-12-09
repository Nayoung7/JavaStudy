package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class Rre_25_2 {

	public static void main(String[] args) {
		// 5개의 정수를 입력받아 선택정렬을 활용하여 오름차순 정렬하여 출력하는 프로그램 구현
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		System.out.println("정렬 후");
		System.out.println(Arrays.toString(array));
		sc.close();

	}

}
