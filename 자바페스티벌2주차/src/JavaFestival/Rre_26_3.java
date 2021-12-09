package JavaFestival;

import java.util.Arrays;

public class Rre_26_3 {

	public static void main(String[] args) {
		// 2차원 배열에 다이아몬드 형태로 출력
		int[][] dia = new int[7][7];
		int start = 3;
		int end = 3;
		int value = 1;

		for (int i = 0; i < dia.length; i++) {
			for (int j = start; j <= end; j++) {
				dia[i][j] = value++;
			}
			if (i < 3) {
				start--;
				end++;
			} else {
				start++;
				end--;
			}
		}

		for (int i = 0; i < dia.length; i++) {
			System.out.println(Arrays.toString(dia[i]));
		}

	}

}
