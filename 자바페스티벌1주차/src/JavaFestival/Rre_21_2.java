package JavaFestival;

import java.util.Scanner;

public class Rre_21_2 {

	public static void main(String[] args) {
		// A�� B�� �Է¹޾� A-B�� ����ϰ� A�� B�� ��� 0�� �Է¹����� ���α׷��� ����ȴ�.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("A �Է� : ");
			int a = sc.nextInt();
			System.out.print("B �Է� : ");
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println("��� : " + (a - b));
			}
		}
		sc.close();

	}

}
