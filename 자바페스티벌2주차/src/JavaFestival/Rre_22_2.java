package JavaFestival;

import java.util.Scanner;

public class Rre_22_2 {

	public static void main(String[] args) {
		// �� ������ �Է� �޾� ������ ���� �ﰢ���� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int num = sc.nextInt();
		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
