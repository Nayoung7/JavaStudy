package Question_2��;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// ���� �߽��� ��Ÿ���� �� ���� �������� �Ǽ� ������ �Է¹ް�
		// �Ǽ� ������ �ٸ� ��(x,y)�� �Է¹޾� �� ���� ���� ���ο� �ִ��� �Ǻ��Ͽ� ����϶�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �߽�(a,b)�� ������(r) �Է� >> ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double r = sc.nextDouble();

		System.out.print("�� (x,y) �Է� >> ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if ((x >= a - r && x <= a + r) && (y >= b - r && y <= b + r)) {
			System.out.printf("�� (%.1f, %.1f)�� �� �ȿ� �ִ�.", x, y);
		} else {
			System.out.printf("�� (%.1f, %.1f)�� �� �ۿ� �ִ�.", x, y);
		}
		sc.close();
	}

}
