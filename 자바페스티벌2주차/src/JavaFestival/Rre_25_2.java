package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class Rre_25_2 {

	public static void main(String[] args) {
		// 5���� ������ �Է¹޾� ���������� Ȱ���Ͽ� �������� �����Ͽ� ����ϴ� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
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

		System.out.println("���� ��");
		System.out.println(Arrays.toString(array));
		sc.close();

	}

}
