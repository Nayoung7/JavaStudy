package JavaFestival;

import java.util.Random;

public class Rre_23_2 {

	public static void main(String[] args) {
		// �ߺ��� ���� ���ڸ� �̴� �ζ� ���α׷��� ����ÿ�
		Random rd = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println("����� ���� : " + lotto[i]);
		}

	}
}
