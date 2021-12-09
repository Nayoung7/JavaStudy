package JavaFestival;

import java.util.Arrays;

public class Rre_27_3 {

	public static void main(String[] args) {
		// 알파벳 순서대로 모래시계 모양대로 출력하는 코드 작성하여 출력
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
