package Question_3��;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// Ű���忡�� ������ �� ���� �׼��� �Է¹޾�
		// ��������, ������, õ����, 500��¥�� ����, 100�� ����, 50��, 10��, 1��¥�� ������ �� ��� ��ȯ�Ǵ��� ����϶�.
		// �ݵ�� ���� �迭�� �̿��ϰ� �ݺ������� �ۼ��϶�

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] == 0) {
				continue;
			} else {
				System.out.println(unit[i] + "�� ¥�� : " + money / unit[i] + "��");
				money %= unit[i];
			}
		}
		sc.close();

	}

}
