package JavaFestival;

import java.util.Arrays;

public class Rre_27_3 {

	public static void main(String[] args) {
		// ���ĺ� ������� �𷡽ð� ����� ����ϴ� �ڵ� �ۼ��Ͽ� ���
		char[][] array = new char[5][5];
		int start = 0;
		int end = 4;
		char value = 65;

		for (int i = 0; i < array.length; i++) {
			for (int j = start; j <= end; j++) {
				array[i][j] = value++;
			}
			if (i < 2) {
				start++;
				end--;
			} else {
				start--;
				end++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
