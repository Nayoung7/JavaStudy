package JavaFestival;

import java.util.Scanner;

public class Rre_18_4 {

	public static void main(String[] args) {
		// ���ڸ��� * ���ڸ��� ������ ������� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ���� ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�� ���� ���� �Է� >> ");
		int num2 = sc.nextInt();

		int one = num2 % 10;
		int ten = num2 % 100 / 10;
		int hundred = num2 / 100;

		System.out.println(num1 * one);
		System.out.println(num1 * ten);
		System.out.println(num1 * hundred);
		System.out.println(num1 * num2);
		sc.close();

	}

}
