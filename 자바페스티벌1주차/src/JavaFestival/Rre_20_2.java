package JavaFestival;

import java.util.Scanner;

public class Rre_20_2 {

	public static void main(String[] args) {
		// 1���� ū ����(N)�� �Է��Ͽ� N!���� ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int n = sc.nextInt();

		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("��� : " + result);
		sc.close();
	}

}
