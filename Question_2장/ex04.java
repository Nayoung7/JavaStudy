package Question_2��;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// ���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ����϶�, ��հ��� �ƴ�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3�� �Է� >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int middle = 0;

		if (num1 > num2 && num1 < num3) {
			middle = num1;
		} else if (num1 > num3 && num1 < num2) {
			middle = num1;
		} else if (num2 > num1 && num2 < num3) {
			middle = num2;
		} else if (num2 > num3 && num2 < num1) {
			middle = num2;
		} else if (num3 > num2 && num3 < num1) {
			middle = num3;
		} else if (num3 > num1 && num3 < num2) {
			middle = num3;
		}
		System.out.println("�߰� ���� " + middle);
		sc.close();
	}

}
