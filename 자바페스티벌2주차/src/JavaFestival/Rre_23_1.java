package JavaFestival;

import java.util.Arrays;
import java.util.Random;

public class Rre_23_1 {

	public static void main(String[] args) {
		// 8ĭ ũ���� �迭�� �����ϰ� �������� �ʱ�ȭ �� �� ���� ū���� ���� ���� ���� ���
		Random rd = new Random();
		int[] array = new int[8];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(99) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
				}
			}
		}
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("�迭�� �ִ� ��� �� : " + Arrays.toString(array));
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);

	}

}
