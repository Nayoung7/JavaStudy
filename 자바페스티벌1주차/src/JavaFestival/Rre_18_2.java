package JavaFestival;

import java.util.Scanner;

public class Rre_18_2 {

	public static void main(String[] args) {
		// �Ž������� �Է¹޾� ������� �ϴ� ������ ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ݾ� : ");
		int money = sc.nextInt();

		System.out.println("�ܵ� ��ȯ");
		int a = money / 10000;
		int b = money % 10000 / 5000;
		int c = money % 10000 % 5000 / 1000;
		int d = money % 10000 % 5000 % 1000 / 500;
		int e = money % 10000 % 5000 % 1000 % 500 / 100;

		System.out.println("10000�� : " + a + "��");
		System.out.println("5000�� : " + b + "��");
		System.out.println("1000�� : " + c + "��");
		System.out.println("500�� : " + d + "��");
		System.out.println("100�� : " + e + "��");
		sc.close();
	}

}
