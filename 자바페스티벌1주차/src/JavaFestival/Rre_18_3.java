package JavaFestival;

import java.util.Scanner;

public class Rre_18_3 {

	public static void main(String[] args) {
		// ������ ���ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է� >> ");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("����");
		} else if (year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���� �ƴ�");
		}
		sc.close();

	}

}
