package JavaFestival;

import java.util.Scanner;

public class Rre_20_1 {

	public static void main(String[] args) {
		// �� ������ �Է¹޾� �ִ������� �ּҰ������ ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
		System.out.print("����1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� >> ");
		int num2 = sc.nextInt();

		int max = 0;
		int min = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
		}
		min = num1 * num2 / max;
		System.out.println("�ִ����� : " + max);
		System.out.println("�ּҰ���� : " + min);
		sc.close();
	}

}
