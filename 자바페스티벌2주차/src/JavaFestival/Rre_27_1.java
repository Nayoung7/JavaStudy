package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class Rre_27_1 {

	public static void main(String[] args) {
		// ���� N�� �Է¹޾� N*N �迭�� ������ ���� ���� �����ϰ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();

		int[][] array = new int[n][n];
		int value = 1;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = value++;
				}
			} else {
				for (int j = array[0].length - 1; j >= 0; j--) {
					array[i][j] = value++;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		sc.close();

	}

}
