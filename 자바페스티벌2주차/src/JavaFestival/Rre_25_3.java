package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class Rre_25_3 {

	public static void main(String[] args) {
		// // 5���� ������ �Է¹޾� ���������� Ȱ���Ͽ� �������� �����Ͽ� ����ϴ� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("���� ��");
		System.out.println(Arrays.toString(array));
		sc.close();
	}

}
