package JavaFestival;

import java.util.Scanner;

public class Rre_18_1 {

	public static void main(String[] args) {
		// ������ �Է¹޾� 1�� �ڸ����� �ݿø��� ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݿø� �� �� : ");
		int num = sc.nextInt();

		int result = 0;
		System.out.print("�ݿø� �� �� : ");
		if (num % 10 > 4) {
			result = (num + 10) / 10 * 10;
		} else {
			result = num / 10 * 10;
		}
		System.out.println(result);
		sc.close();
	}

}
