package Question_2��;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// 2���� ��鿡�� ���簢���� ���� ��� �𼭸��� ������ �ϴ� �𼭸��� �� ������ ǥ���ȴ�. Ű����κ��� ���簢���� �����ϴ� �� ��
		// (x1, y1), (x2, y2)�� �Է¹޾� (100, 100), (200, 200)�� �� ������ �̷���� ���簢���� �浹�ϴ��� �Ǻ��ϴ�
		// ���α׷��� �ۼ��϶�.

		Scanner sc = new Scanner(System.in);
		System.out.print("x1, y1�� ���� �Է����ּ��� >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("x2, y2�� ���� �Է����ּ��� >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		boolean a = inRect(x1, y1);
		boolean b = inRect(x2, y2);

		if (a == true || b == true) {
			System.out.println("�� �簢���� �浹�մϴ�.");
		} else {
			System.out.println("�� �簢���� �浹���� �ʽ��ϴ�.");
		}
		sc.close();

	}

	public static boolean inRect(int x, int y) {
		if ((x >= 100 && x <= 200) & (y >= 100 && y <= 200)) {
			return true;
		} else {
			return false;
		}
	}

}
