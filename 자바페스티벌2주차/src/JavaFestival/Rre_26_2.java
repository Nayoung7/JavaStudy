package JavaFestival;

import java.util.Arrays;

public class Rre_26_2 {

	public static void main(String[] args) {
		// 2���� �迭�� �������� 180�� ȸ���Ͽ� ���
		int[][] array = new int[5][5];
		int value = 1;
		System.out.println("����");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = value++;
			}
			System.out.println(Arrays.toString(array[i]));
		}

		System.out.println("180�� ȸ��");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[array.length - 1 - i][array.length - 1 - j] + " ");
			}
			System.out.println();
		}
	}

}
