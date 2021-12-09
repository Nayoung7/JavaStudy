package JavaFestival;

import java.util.Arrays;

public class Rre_26_2 {

	public static void main(String[] args) {
		// 2차원 배열을 왼쪽으로 180도 회전하여 출력
		int[][] array = new int[5][5];
		int value = 1;
		System.out.println("원본");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = value++;
			}
			System.out.println(Arrays.toString(array[i]));
		}

		System.out.println("180도 회전");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[array.length - 1 - i][array.length - 1 - j] + " ");
			}
			System.out.println();
		}
	}

}
