package JavaFestival;

import java.util.Scanner;

public class Rre_24_1 {

	public static void main(String[] args) {
		// N�� X�� �Է¹ް� N���� ������ �߰��� �Է¹޴´�.
		// N���� ���� �� X���� ���� ���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� : ");
		int n = sc.nextInt();
		System.out.print("X �Է� : ");
		int x = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >> ");
			array[i] = sc.nextInt();
		}
		System.out.print("��� >> ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] < x) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();

	}

}
