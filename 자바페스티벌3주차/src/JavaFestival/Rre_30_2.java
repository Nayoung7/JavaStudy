package JavaFestival;

import java.util.Scanner;

public class Rre_30_2 {

	public static void main(String[] args) {
		// num1, num2, op�� �Ű������� �޾� num1�� num2�� op�� �°� ������ �������
		// ��ȯ���ִ� cal �޼ҵ带 �ۼ��ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("������(+,-,*,/) �Է� : ");
		String op = sc.next();

		System.out.println(cal(num1, num2, op));
		sc.close();
	}

	public static int cal(int num1, int num2, String op) {
		if (op.equals("+")) {
			return num1 + num2;
		} else if (op.equals("-")) {
			return num1 - num2;
		} else if (op.equals("*")) {
			return num1 * num2;
		} else {
			return num1 / num2;
		}

	}

}
