package Question_2��;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// ���� ������ �ޱ� ���� Ű����κ��� ���� �߽��� ��Ÿ���� �� ���� �������� �Է¹޴´�.
		// �� ���� ���� �Է¹ް� �� ���� ���� ��ġ���� �Ǵ��Ͽ� ����϶�.

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �߽�(x,y)�� ������ �Է� >> ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		System.out.print("�� ��° ���� �߽ɰ� ������ �Է� >> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();

		double sub1 = Math.abs(x1 - x2) * Math.abs(x1 - x2);
		double sub2 = Math.abs(y1 - y2) * Math.abs(y1 - y2);
		double distance = Math.sqrt(sub1 + sub2);

		if (distance <= (r1 + r2)) {
			System.out.println("�� ���� ���� ��ģ��.");
		} else {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}
		sc.close();

	}

}
