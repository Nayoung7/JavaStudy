package Question_2��;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// �ﰢ���� ���� ���̸� ��Ÿ���� ������ 3�� �Է¹ް� �� 3���� ���� �ﰢ���� ���� �� �ִ��� �Ǻ��϶�. �ﰢ���� �Ƿ��� �� ���� ���� �ٸ�
		// �� ���� �պ��� Ŀ�� �Ѵ�.

		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		System.out.print("���� 3���� �Է��Ͻÿ� >> ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];
		boolean result = false;
		// �ﰢ���� ���� : ���� �� ���� ���̰� ������ �� ���� �պ��� �۴�.
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		if (max == array[0]) {
			if (array[0] < array[1] + array[2]) {
				result = true;
			}
		} else if (max == array[1]) {
			if (array[1] < array[0] + array[2]) {
				result = true;
			}
		} else if (max == array[2]) {
			if (array[2] < array[0] + array[1]) {
				result = true;
			}
		}
		if (result) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		} else {
			System.out.println("�ﰢ���� �� �� �����ϴ�.");
		}
		sc.close();
	}

}
