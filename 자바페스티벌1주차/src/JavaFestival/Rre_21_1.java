package JavaFestival;

import java.util.Scanner;

public class Rre_21_1 {

	public static void main(String[] args) {
		// ���μ� ���ظ� ���ִ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		System.out.print(num + " = ");
		for (int i = 2; i <= num; i++) {
			// i�� �����λ��·� num���� ������
			// �׷��� num % i�� 0�� �ƴϸ� while�� ������ ���� for������ 1����
			while (num % i == 0) {
				num = num / i;
				System.out.print(i);

				if (num == 1) {
					break;
				} else {
					System.out.print("*");
				}
			}

		}
		sc.close();

	}
}
