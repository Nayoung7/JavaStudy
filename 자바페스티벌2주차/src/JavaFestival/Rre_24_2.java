package JavaFestival;

import java.util.Arrays;

public class Rre_24_2 {

	public static void main(String[] args) {
		// �Ʒ��� ���� 1������ ������ �־�������, �� �� ���� �Ÿ��� ª�� ��(index)���� ���
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] address = new int[2];
		int min = Math.abs(point[0] - point[1]);

		for (int i = 0; i < point.length - 1; i++) {
			for (int j = i + 1; j < point.length; j++) {
				if (min > Math.abs(point[i] - point[j])) {
					min = Math.abs(point[i] - point[j]);
					address[0] = i;
					address[1] = j;
				}
			}
		}

		System.out.println("result = " + Arrays.toString(address));
	}

}
